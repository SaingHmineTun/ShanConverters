package it.saimao;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import static it.saimao.ShanSyllableBreaker.syllable_break;

public class TaiglishConverter {
    public static String taiToEng(String input) {

        String output = syllable_break(input);
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
        // r - ြ
        output = output.replaceAll("\\u103c", "r");
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
        output = output.replaceAll("ʼa ", "a ");

        return output.trim();

    }

}
