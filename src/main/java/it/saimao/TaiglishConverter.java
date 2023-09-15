package it.saimao;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class TaiglishConverter {
    public static String taiToEng(String input) {

        String output = input;

         // ၵႆ ပိၼ်ႇပဵၼ် ၵၺ်
        output = output.replaceAll("\\u1086", "\u107a\u103a");

        // ဢပ် - ဢaပ်
        output = output.replaceAll("([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1a$2$3");

        // o - ဢူဝ်
        output = output.replaceAll("([^\\u102d])\\u1030\\u101d\\u103a", "$1o");
        // ဢူမ် ၊ ဢိူမ် ( ၵူ becomes ku but ၵူမ် must become kom )
        output = output.replaceAll("([^\\u102d])(\\u1030)([\\u1075-\\u1081\\u1004\\u101e\\u1010\\u1011\\u1015\\u1019\\u101a\\u101b\\u101c\\u101d\\u1022])(\\u103a)", "$1\u006f$3$4");
        // Omit - လိုဝ် ၊ ၵိူဝ်
        output = output.replaceAll("(\\u102d\\u102f|\\u1030)\\u101d\\u103a", "$1");

        // Shan Consonants

        // k - ၵ
        output = output.replaceAll("\\u1075\\u103a?", "\u006b");
        // kh - ၶ
        output = output.replaceAll("\\u1076\\u103a?", "\u006b\u0068");
        // ng - င
        output = output.replaceAll("\\u1004\\u103a?", "\u006e\u0067");
        // z - ၸ
        output = output.replaceAll("\\u1078\\u103a?", "\u007a");
        // s - သ
        output = output.replaceAll("\\u101e\\u103a?", "\u0073");
        // i - ၵႆ ၊ ၵၺ်
        output = output.replaceAll("\\u1086|\\u107a\\u103a", "i");
        // ny - ၺ
        output = output.replaceAll("\\u107a", "\u006e\u0079");
        // t - တ
        output = output.replaceAll("\\u1010\\u103a?", "\u0074");
        // th - ထ
        output = output.replaceAll("\\u1011\\u103a?", "\u0074\u0068");
        // n - ၼ
        output = output.replaceAll("\\u107c\\u103a?", "\u006e");
        // p - ပ
        output = output.replaceAll("\\u1015\\u103a?", "\u0070");
        // ph - ၽ
        output = output.replaceAll("\\u107d\\u103a?", "\u0070\uu0068");
        // f - ၾ
        output = output.replaceAll("\\u107e\\u103a?", "\u0066");
        // m - မ
        output = output.replaceAll("\\u1019\\u103a?", "\u006d");
        // y - ယ
        output = output.replaceAll("\\u101a\\u103a?", "\u0079");
        // r - ရ
        output = output.replaceAll("\\u101b\\u103a?", "\u0072");
        // l - လ
        output = output.replaceAll("\\u101c\\u103a?", "\u006c");
        // eao - ဢႅဝ်
        output = output.replaceAll("\\u1085\\u101d\\u103a", "\u0065\u0061\u006f");
        // ဝ - ဝ်
        output = output.replaceAll("\\u101d\\u103a", "\u006f");
        // w - ဝ
        output = output.replaceAll("\\u101d", "\u0077");
        // h - ႁ
        output = output.replaceAll("\\u1081\\u103a?", "\u0068");
        // a - ဢ
        // "{  \"from\": \"\\u1022\",  \"to\": \"\\u195f\" }," +

        // End Tai Consonants



        // au - ဢေႃ ၊ ဢွ
        output = output.replaceAll("(\\u1031\\u1083)|\\u103d", "\u0061\u0075");
        // ue - ဢို
        output = output.replaceAll("\\u102d\\u102f", "\u0075\u0065");
        // oe - ဢိူ
        output = output.replaceAll("\\u102d\\u1030", "\u006f\u0065");
        // aa - ဢႃ ၊ ဢၢ
        output = output.replaceAll("\\u1083|\\u1062", "\u0061\u0061");
        // i - ဢီ ၊ ဢိ
        output = output.replaceAll("\\u102e|\\u102d", "\u0069");
        // ae - ဢေ ၊ ဢဵ
        output = output.replaceAll("\\u1031|\\u1035", "\u0061\u0065");
        // e - ဢႄ ၊ ဢႅ
        output = output.replaceAll("\\u1084|\\u1085", "\u0065");
        // u - ဢု ၊ ဢူ
        output = output.replaceAll("\\u102f|\\u1030", "\u0075");
        // aue - ဢႂ်
        output = output.replaceAll("(\\u1082\\u103a)|(\\u103a\\u1082)", "aue");
        // w - ဢႂ
        output = output.replaceAll("\\u1082", "w");

        return output;

    }

}
