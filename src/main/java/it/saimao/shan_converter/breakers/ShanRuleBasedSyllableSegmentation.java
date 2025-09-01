package it.saimao.shan_converter.breakers;

import java.util.regex.Pattern;

public class ShanRuleBasedSyllableSegmentation {

    // ===== Character classes =====
    private static final String CONSONANT_COMBO = "မၼငပတၵၺဝ";
    private static final String CONSONANTS = "\u1075-\u1081\u1004\u101e\u1010\u1011\u1015\u1019\u101a\u101b\u101c\u101d\u1022";


    private static final String V1 = "\u1083\u102E\u1084"; // ဢႃ၊ ဢီ၊ ဢႄ vowels
    private static final String V2 = "\u1030";             // ဢူ
    private static final String V3 = "\u1031";             // ေ
    private static final String ARR_YAO = "\u1083";        // ႃ

    // ၸမ်ႈတႂ်ႈသွင် (tone marks)
    private static final String TONE_MARKS = "\u1087\u1088\u1038\u1037\u1089\u108a";

    // ဢ် | ဢႆ
    private static final String ASAT = "\u103a";

    // ဢႆ
    private static final String KAI_KHIN = "\u1086";

    // English + numbers
    private static final String EN_CHAR = "a-zA-Z0-9";

    // Other symbols, digits, punctuation
    private static final String OTHER_CHAR = "႐-႙၀-၉၊။" +
            "!-/:-@\\[-`\\{-~\\s";

    // ===== Segmentation =====
    public static String segment(String input) {
        String[][] rules = {
                // Rule 0: Break consonant clusters
                {
                        "([" + CONSONANTS + "])" +
                                "([" + CONSONANTS + "](?!" + ASAT + "))" +
                                "([" + CONSONANTS + "](?!" + ASAT + "))",
                        "$1 $2 $3"},
                {"([" + CONSONANTS + "])([ျ,ံ,ု,ူ,ိ,ီ,ွ,ႂ])?([" + CONSONANTS + "])(?!" + ASAT + ")", "$1$2 $3"},

                // Rule 1: Tone marks, English, or other symbols → break after
                {"([" + TONE_MARKS + EN_CHAR + OTHER_CHAR + "])", "$1 "},

                // Rule 2: Asat, Kai Khin or V1, unless followed by tone → break
                {"([" + ASAT + KAI_KHIN + V1 + "])(?![" + TONE_MARKS + "])", "$1 "},

                // Rule 3: V2 (ူ), unless followed by consonant+asat or tone → break
                {"(" + V2 + ")(?!([" + CONSONANT_COMBO + "][" + ASAT + "]|[" + TONE_MARKS + "]))", "$1 "},

                // Rule 4: V3 (ေ), unless followed by arrYao or tone → break
                {"(" + V3 + ")(?!(" + ARR_YAO + "|[" + TONE_MARKS + "]))", "$1 "},

                // Rule 5: Collapse multiple spaces
                {" +", " "}
        };


        String output = input;
        for (String[] rule : rules) {
            output = output.replaceAll(rule[0], rule[1]);
        }

        return output.strip();
    }

    public static String[] segmentAsArray(String input) {
        return segment(input).split(" ");
    }
}
