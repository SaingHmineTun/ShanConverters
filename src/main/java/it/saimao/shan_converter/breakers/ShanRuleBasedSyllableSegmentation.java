package it.saimao.shan_converter.breakers;

public class ShanRuleBasedSyllableSegmentation {
    // Consonants that are used to combine with Asat
    static String consonantCombination = "မၼငပတၵၺဝ";
    // ဢႃ ဢီ ဢေ ဢႄ ဢူ
    static String independentVowels = "\u1083\u1031\u1084\u102E\u1030";

    static String v1 = "\u1083\u102E\u1084";
    static String v2 = "\u1030";
    static String v3 = "\u1031";
    static String arrYao = "\u1083";
    // ႇ ႈ း ့ ႉ ႊ - ၸမ်ႈတႂ်ႈသွင်ဢၼ်
    static String toneMarks = "\u1087\u1088\u1038\u1037\u1089\u108a";
    // ဢ် ဢႆ
    static String asat = "\u103a|\u1086";
    public static final String enChar = "a-zA-Z0-9";
    //"ဣဤဥဦဧဩဪဿ၌၍၏၀-၉၊။!-/:-@[-`{-~\s"
    public static final String otherChar = "\u1023\u1024\u1025\u1026\u1027\u1029\u102a\u103f\u104c\u104d\u104f\u1040-\u1049\u104a\u104b!-/:-@\\[-`\\{-~\\s";

    public static String segment(String input) {
//        input = input.replaceAll("[" + toneMarks + "]", "");
        String output = input
                .replaceAll("([" + toneMarks + "]|[" + enChar + otherChar + "])", "$1\u0020")
                .replaceAll("([" + asat + v1 + "])(?![" + toneMarks + "])", "$1\u0020")
                .replaceAll("(" + v2 + ")(?!([" + consonantCombination + "]" + asat + ")|[" + toneMarks + "])", "$1\u0020")
                .replaceAll("(" + v3 + ")(?!(" + arrYao + ")|[" + toneMarks + "])", "$1\u0020")
                .replaceAll("\\u0020+", "\u0020")
                ;

        return output;
    }


}
