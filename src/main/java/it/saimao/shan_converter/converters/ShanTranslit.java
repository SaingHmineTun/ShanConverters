package it.saimao.shan_converter.converters;


import it.saimao.shan_converter.breakers.ShanSyllableBreaker;

import java.util.regex.Pattern;

public class ShanTranslit {
    public static String taiToEng(String input) {

        String output = ShanSyllableBreaker.syllable_break(input);
        // "ၵ" "ၵျ" "တြ" ႁႂ်ႈပဵတ် ka kya tra
        output = output.replaceAll("^([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])([\\u103b\\u103c])?$", "$1$2a");

        // Without arrpot, arr yau, tang, tang sung, tit nin, tit sung, a sai, a tang, e sai, e tang, kwai, hwai, tay tay tin,
        output = output.replaceAll("(\\u0020)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(?![\\u1062\\u1083\\u102d\\u102e\\u102f\\u1030\\u1031\\u1035\\u1084\\u1085\\u1082\\u103d\\u1036\\u1086\\u101d\\u107a\\u1075\\u1010\\u1015\\u1004\\u1019\\u107c\\u103b\\u103c])", "$1$2$3a");
        output = output.replaceAll("([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(\\u0020)", "$1$2a$3");
        output = output.replaceAll("(\\u0020)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(\\u0020)", "$1$2$3a$4");


        // ၵႆ ပိၼ်ႇပဵၼ် ၵၺ်
        output = output.replaceAll("\\u1086", "\u107a\u103a");

        // ဢပ် - ဢaပ်
        output = output.replaceAll("([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1a\u030c$2$3");

        // o - ဢူဝ်
        output = output.replaceAll("([^\\u102d])\\u1030\\u101d\\u103a", "$1o\u030c");
        // ဢူမ် ၊ ဢိူမ် ( ၵူ becomes ku but ၵူမ် must become kom )
        output = output.replaceAll("([^\\u102d])(\\u1030)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1o\u030c$3$4");
        // Omit - လိုဝ် ၊ ၵိူဝ်
        output = output.replaceAll("(\\u102d\\u102f|\\u1030)\\u101d\\u103a", "$1");

        // Shan Consonants

        // k - ၵ
        output = output.replaceAll("\\u1075\\u103a?", "k");
        // kh - ၶ
        output = output.replaceAll("\\u1076\\u103a?", "kh");
        // ng - င
        output = output.replaceAll("\\u1004\\u103a?", "ng");
        // ts - ၸ
        output = output.replaceAll("\\u1078\\u103a?", "ts");
        // s - သ
        output = output.replaceAll("\\u101e\\u103a?", "s");
        // i - ၵႆ ၊ ၵၺ်
        output = output.replaceAll("\\u1086|\\u107a\\u103a", "i");
        // ny - ၺ
        output = output.replaceAll("\\u107a", "ny");
        // t - တ
        output = output.replaceAll("\\u1010\\u103a?", "t");
        // th - ထ
        output = output.replaceAll("\\u1011\\u103a?", "th");
        // n - ၼ
        output = output.replaceAll("\\u107c\\u103a?", "n");
        // p - ပ
        output = output.replaceAll("\\u1015\\u103a?", "p");
        // ph - ၽ
        output = output.replaceAll("\\u107d\\u103a?", "ph");
        // f - ၾ
        output = output.replaceAll("\\u107e\\u103a?", "f");
        // m - မ
        output = output.replaceAll("\\u1019\\u103a?", "m");
        // y - ယ
        output = output.replaceAll("\\u101a\\u103a?", "y");
        // r - ရ
        output = output.replaceAll("\\u101b\\u103a?", "r");
        // r - ြ
        output = output.replaceAll("\\u103c", "r");
        // l - လ
        output = output.replaceAll("\\u101c\\u103a?", "l");
        // eao - ဢႅဝ်
        output = output.replaceAll("\\u1085\\u101d\\u103a", "e\u030cao");
        // ဝ - ဝ်
        output = output.replaceAll("\\u101d\\u103a", "o");
        // w - ဝ
        output = output.replaceAll("\\u101d", "w");
        // h - ႁ
        output = output.replaceAll("\\u1081\\u103a?", "h");
        // ‘ - ဢ
        output = output.replaceAll("\\u1022", "ʼ");
        // y - ျ
        output = output.replaceAll("\\u103b", "y");
        //
        output = output.replaceAll("\\u1036", "a\u030cm");

        // End Tai Consonants


        // au - ဢေႃ ၊ ဢွ
        output = output.replaceAll("(\\u1031\\u1083)|\\u103d", "a\u030cu");
        // ue - ဢို
        output = output.replaceAll("\\u102d\\u102f", "u\u030ce");
        // oe - ဢိူ
        output = output.replaceAll("\\u102d\\u1030", "o\u030ce");
        // aa - ဢႃ ၊ ဢၢ
        output = output.replaceAll("\\u1083|\\u1062", "a\u030ca");
        // i - ဢိ
        output = output.replaceAll("\\u102d", "i\u030c");
        // ii - ဢီ
        output = output.replaceAll("\\u102e", "i\u030ci");
        // ae - ဢေ ၊ ဢဵ
        output = output.replaceAll("\\u1031|\\u1035", "a\u030ce");
        // e - ဢႄ ၊ ဢႅ
        output = output.replaceAll("\\u1084|\\u1085", "e\u030c");
        // u - ဢု
        output = output.replaceAll("\\u102f", "u\u030c");
        // uu - ဢူ
        output = output.replaceAll("\\u1030", "u\u030c");
        // aue - ဢႂ်
        output = output.replaceAll("(\\u1082\\u103a)|(\\u103a\\u1082)", "a\u030cue");
        // w - ဢႂ
        output = output.replaceAll("\\u1082", "w");


        /**
         * တႃႇတူၼ်းသဵင် 6 တူၼ်း
         * ယၵ်း ၊ ယၵ်းၸမ်ႈ ၊ ၸမ်ႈၼႃႈ ၊ ၸမ်ႈတႂ်ႈ ၊ ယၵ်းၶိုၼ်ႈ
         */
        // ယၵ်း
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1087", "$1$2\u0300$4");
        // ယၵ်းၸမ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1088", "$1$2\u0304$4");
        // ၸမ်ႈၼႃႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1038", "$1$2\u0301$4");
        // ၸမ်ႈတႂ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})[\\u1089\\u1037]", "$1$2\u0302\u0330$4");
        // ယၵ်းၶိုၼ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u108a", "$1$2\u1dc8$4");
        // Convert - ʼa => a
        // TODO : Error when deleted -> ဢ ။ ERROR WHEN NOT DELETED -> ၸ
//        output = output.replaceAll("ʼa[]", "a ");
        output = output.replaceAll("([ .?,!])?ʼa([ .?,!])", "$1a$2");

        // ။ -> .
        output = output.replaceAll("\u104b", ".");
        // ၊ -> ,
        output = output.replaceAll("\u104a", ",");

        return output.trim();

    }
    public static String taiToEngWithoutTone(String input) {

        String output = ShanSyllableBreaker.syllable_break(input);
        // "ၵ" "ၵျ" "တြ" ႁႂ်ႈပဵတ် ka kya tra
        output = output.replaceAll("^([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])([\\u103b\\u103c])?$", "$1$2a");

        // Without arrpot, arr yau, tang, tang sung, tit nin, tit sung, a sai, a tang, e sai, e tang, kwai, hwai, tay tay tin,
        output = output.replaceAll("(\\u0020)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(?![\\u1062\\u1083\\u102d\\u102e\\u102f\\u1030\\u1031\\u1035\\u1084\\u1085\\u1082\\u103d\\u1036\\u1086\\u101d\\u107a\\u1075\\u1010\\u1015\\u1004\\u1019\\u107c\\u103b\\u103c])", "$1$2$3a");
        output = output.replaceAll("([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(\\u0020)", "$1$2a$3");
        output = output.replaceAll("(\\u0020)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022\\u103b\\u103c])([\\u103b\\u103c])?(\\u0020)", "$1$2$3a$4");


        // ၵႆ ပိၼ်ႇပဵၼ် ၵၺ်
        output = output.replaceAll("\\u1086", "\u107a\u103a");

        // ဢပ် - ဢaပ်
        output = output.replaceAll("([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1a\u030c$2$3");

        // o - ဢူဝ်
        output = output.replaceAll("([^\\u102d])\\u1030\\u101d\\u103a", "$1o\u030c");
        // ဢူမ် ၊ ဢိူမ် ( ၵူ becomes ku but ၵူမ် must become kom )
        output = output.replaceAll("([^\\u102d])(\\u1030)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1o\u030c$3$4");
        // Omit - လိုဝ် ၊ ၵိူဝ်
        output = output.replaceAll("(\\u102d\\u102f|\\u1030)\\u101d\\u103a", "$1");

        // Shan Consonants

        // k - ၵ
        output = output.replaceAll("\\u1075\\u103a?", "k");
        // kh - ၶ
        output = output.replaceAll("\\u1076\\u103a?", "kh");
        // ng - င
        output = output.replaceAll("\\u1004\\u103a?", "ng");
        // ts - ၸ
        output = output.replaceAll("\\u1078\\u103a?", "ts");
        // s - သ
        output = output.replaceAll("\\u101e\\u103a?", "s");
        // i - ၵႆ ၊ ၵၺ်
        output = output.replaceAll("\\u1086|\\u107a\\u103a", "i");
        // ny - ၺ
        output = output.replaceAll("\\u107a", "ny");
        // t - တ
        output = output.replaceAll("\\u1010\\u103a?", "t");
        // th - ထ
        output = output.replaceAll("\\u1011\\u103a?", "th");
        // n - ၼ
        output = output.replaceAll("\\u107c\\u103a?", "n");
        // p - ပ
        output = output.replaceAll("\\u1015\\u103a?", "p");
        // ph - ၽ
        output = output.replaceAll("\\u107d\\u103a?", "ph");
        // f - ၾ
        output = output.replaceAll("\\u107e\\u103a?", "f");
        // m - မ
        output = output.replaceAll("\\u1019\\u103a?", "m");
        // y - ယ
        output = output.replaceAll("\\u101a\\u103a?", "y");
        // r - ရ
        output = output.replaceAll("\\u101b\\u103a?", "r");
        // r - ြ
        output = output.replaceAll("\\u103c", "r");
        // l - လ
        output = output.replaceAll("\\u101c\\u103a?", "l");
        // eao - ဢႅဝ်
        output = output.replaceAll("\\u1085\\u101d\\u103a", "e\u030cao");
        // ဝ - ဝ်
        output = output.replaceAll("\\u101d\\u103a", "o");
        // w - ဝ
        output = output.replaceAll("\\u101d", "w");
        // h - ႁ
        output = output.replaceAll("\\u1081\\u103a?", "h");
        // ‘ - ဢ
        output = output.replaceAll("\\u1022", "ʼ");
        // y - ျ
        output = output.replaceAll("\\u103b", "y");
        //
        output = output.replaceAll("\\u1036", "a\u030cm");

        // End Tai Consonants


        // au - ဢေႃ ၊ ဢွ
        output = output.replaceAll("(\\u1031\\u1083)|\\u103d", "a\u030cu");
        // ue - ဢို
        output = output.replaceAll("\\u102d\\u102f", "u\u030ce");
        // oe - ဢိူ
        output = output.replaceAll("\\u102d\\u1030", "o\u030ce");
        // aa - ဢႃ ၊ ဢၢ
        output = output.replaceAll("\\u1083|\\u1062", "a\u030ca");
        // i - ဢိ
        output = output.replaceAll("\\u102d", "i\u030c");
        // ii - ဢီ
        output = output.replaceAll("\\u102e", "i\u030ci");
        // ae - ဢေ ၊ ဢဵ
        output = output.replaceAll("\\u1031|\\u1035", "a\u030ce");
        // e - ဢႄ ၊ ဢႅ
        output = output.replaceAll("\\u1084|\\u1085", "e\u030c");
        // u - ဢု
        output = output.replaceAll("\\u102f", "u\u030c");
        // uu - ဢူ
        output = output.replaceAll("\\u1030", "u\u030c");
        // aue - ဢႂ်
        output = output.replaceAll("(\\u1082\\u103a)|(\\u103a\\u1082)", "a\u030cue");
        // w - ဢႂ
        output = output.replaceAll("\\u1082", "w");


        /**
         * တႃႇတူၼ်းသဵင် 6 တူၼ်း
         * ယၵ်း ၊ ယၵ်းၸမ်ႈ ၊ ၸမ်ႈၼႃႈ ၊ ၸမ်ႈတႂ်ႈ ၊ ယၵ်းၶိုၼ်ႈ
         */
        // ယၵ်း
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1087", "$1$2$4");
        // ယၵ်းၸမ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1088", "$1$2$4");
        // ၸမ်ႈၼႃႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u1038", "$1$2$4");
        // ၸမ်ႈတႂ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})[\\u1089\\u1037]", "$1$2$4");
        // ယၵ်းၶိုၼ်ႈ
        output = output.replaceAll("([khgzsytnpfmrlwaʼ])([aeiou])(\\u030c)([a-z]{0,3})\\u108a", "$1$2$4");
        // ပဝ်ႇ
        output = output.replaceAll("\\u030c", "");
        // Convert - ʼa => a
        // TODO : Error when deleted -> ဢ ။ ERROR WHEN NOT DELETED -> ၸ
//        output = output.replaceAll("ʼa[]", "a ");
        output = output.replaceAll("([ .?,!])?ʼa([ .?,!])", "$1a$2");

        // ။ -> .
        output = output.replaceAll("\u104b", ".");
        // ၊ -> ,
        output = output.replaceAll("\u104a", ",");

        return output.trim();

    }

    public static String engToTai(String input) {
        String output = input.toLowerCase();

        String checkIsToneMarkIncludingOrNot = "(?!.*(?:\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8))[\\s\\S]*";
        if (Pattern.matches(checkIsToneMarkIncludingOrNot, input)) {
            output = output.replaceAll("(k|kh|ng|ts|z|j|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|ʼ)([aeiou])", "$1$2\u030c");
        }

        // y - ပျ
        output = output.replaceAll("^(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|ʼ)y(a)$", "$1\u103b");
        // r - တြ
        output = output.replaceAll("^(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|ʼ)r(a)$", "$1\u103c");
        // a - ဢ
        output = output.replaceAll("^a$", "ʼ");
        output = output.replaceAll("^(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|ʼ)?a$", "$1");


        // r - တြ
        output = output.replaceAll("(k|kh|ng|ts|s|t|th|p|ph|f|m|y|r|l|w|h)r", "$1\u103c");
        // y - ပျ
        output = output.replaceAll("(k|kh|ng|ts|s|t|th|p|ph|f|m|y|r|l|w|h)y", "$1\u103b");

        // \u030c , \u0300 , \u0304 , \u0301 , \u0302\u0330 , \u1dc8
        // ဢႃ
        output = output.replaceAll("a(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)a", "$1\u1083");
        // ဢီ
        output = output.replaceAll("i(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)i", "$1\u102e");
        output = output.replaceAll("i(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)", "$1\u102d");
        // ဢႅဝ်
        output = output.replaceAll("e(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)a", "$1\u1085");
        // ဢႄ
        output = output.replaceAll("e(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)", "$1\u1084");
        // ဢေ
        output = output.replaceAll("a(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)e", "$1\u1031");
        // ဢိုၼ်
        output = output.replaceAll("u(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)e(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|i|ʼ)", "$1ို$2");

        // ဢိုဝ်
        output = output.replaceAll("u(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)e", "$1ိုဝ");

        // ဢုၼ်
        output = output.replaceAll("u(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|i|ʼ)", "$1ု$2");
        // ဢူ
        output = output.replaceAll("u(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)", "$1\u1030");
        // ဢိူၼ်
        output = output.replaceAll("o(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)e(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|i|ʼ)", "$1ိူ$2");

        // ဢိူဝ်
        output = output.replaceAll("o(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)e", "$1ိူဝ");
        // ဢူၼ်
        output = output.replaceAll("o(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|i|ʼ)", "$1ူ$2");
        // ဢူဝ်
        output = output.replaceAll("o(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)", "$1ူဝ");
        // ဢွမ်
        output = output.replaceAll("a(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)u(k|kh|ng|ts|s|ny|t|th|n|p|ph|f|m|y|r|l|w|h|i|ʼ)", "$1\u103d$2");

        // ဢႂ်
        output = output.replaceAll("a(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)ue", "$1ႂ်");

        // ဢေႃ
        output = output.replaceAll("a(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)u", "$1ေႃ");


        // kh - ၶ
        output = output.replaceAll("kh", "ၶ");
        // ng - င
        output = output.replaceAll("ng", "င");
        // th - ထ
        output = output.replaceAll("th", "ထ");
        // ny - ၺ
        output = output.replaceAll("ny|i", "ၺ");
        // ts - ၸ
        output = output.replaceAll("ts|j|z", "ၸ");
        // ph - ၽ
        output = output.replaceAll("ph", "ၽ");
        // k - ၵ
        output = output.replaceAll("k", "ၵ");
        // s - သ
        output = output.replaceAll("s", "သ");
        // i - ၵႆ ၊ ၵၺ်
        // output = output.replaceAll("\\u1086|\\u107a\\u103a", "i");
        // t - တ
        output = output.replaceAll("t", "တ");
        // n - ၼ
        output = output.replaceAll("n", "ၼ");
        // p - ပ
        output = output.replaceAll("p", "ပ");
        // f - ၾ
        output = output.replaceAll("f", "ၾ");
        // m - မ
        output = output.replaceAll("m", "မ");
        // y - ယ
        output = output.replaceAll("y", "ယ");
        // r - ရ
        output = output.replaceAll("r", "ရ");
        // l - လ
        output = output.replaceAll("l", "လ");
        // eao - ဢႅဝ်
        // output = output.replaceAll("\\u1085\\u101d\\u103a", "e\u030cao");
        // ဝ - ဝ်
        // output = output.replaceAll("\\u101d\\u103a", "o");
        // h - ႁ
        output = output.replaceAll("h", "ႁ");

        // aa -> ဢႃ
        // ‘ - ဢ
        output = output.replaceAll("ʼ", "ဢ");

        // kwam -> ၵႂမ်
        output = output.replaceAll("([က-အၵ-ႁဢ])w", "$1\u1082");
        // wam -> ဝမ်
        output = output.replaceAll("w|o", "ဝ");

        //
        // \u030c , \u0300 , \u0304 , \u0301 , \u0302\u0330 , \u1dc8
        output = output.replaceAll("(\\u030c|\\u0300|\\u0304|\\u0301|\\u0302\\u0330|\\u1dc8)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢ])", "$1$2$3\u103a");

        // FINAL : Replace a with blank
        output = output.replaceAll("a", "");
        // ပဝ်ႇ
        output = output.replaceAll("(\\u030c)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3");
        // ယၵ်း
        output = output.replaceAll("(\\u0300)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3\u1087");
        // ယၵ်းၸမ်ႈ
        output = output.replaceAll("(\\u0304)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3\u1088");
        // ၸမ်ႈၼႃႈ
        output = output.replaceAll("(\\u0301)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3\u1038");
        // ၸမ်ႈတႂ်ႈ
        output = output.replaceAll("(\\u0302\\u0330)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3\u1089");
        // ယၵ်းၶိုၼ်ႈ
        output = output.replaceAll("(\\u1dc8)(ႃ|ီ|ႄ|ႅ|ေႃ|ေ|ူ|ု|ွ|ို|ိူ|ိ)?([က-အၵ-ႁဢႂ]\\u103a)?", "$2$3\u108a");

        output = output.replaceAll("ႃ([က-အၵ-ႁဢ])်", "ၢ$1်");
        output = output.replaceAll("ေ([က-အၵ-ႁဢ])်", "ဵ$1်");
        output = output.replaceAll("ႄ([က-အၵ-ႁဢ])်", "ႅ$1်");
        // ၶၺ် ၊ ၶၢၺ် ၊ ၵႂၢၺ် -> ၶႆ ၊ ၶၢႆ ၊ ၵႂၢႆ
        output = output.replaceAll("([က-အၵ-ႁဢ])(\\u1082)?([\\u1062\\u103d])?ၺ်", "$1$2$3\u1086");

        // full stop, comma, question mark

        // ။ -> .
        output = output.replaceAll("\\.", "\u104b");
        // ၊ -> ,
        output = output.replaceAll(",", "\u104a");

        return output;
    }


}
