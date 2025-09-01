package it.saimao.shan_language_tools.breakers;

public class ShanSyllableBreaker {

    private static final String TONE_MARKS = "\u1087\u1088\u1038\u1089\u1037\u108a";
    private static final String ASAT = "\u103a";
    private static final String CONSONANTS = "\u1075-\u1081\u1004\u101e\u1010\u1011\u1015\u1019\u101a\u101b\u101c\u101d\u1022";
    private static final String ENG_CHAR = "a-zA-Z0-9";
    private static final String OTHER_CHAR = "႐-႙၀-၉၊။" +
            "!-/:-@\\[-`\\{-~\\s";

    public static String syllable_break(String input) {
        String text = purification(input);

        // Reorder vowel killers with asat
        text = text.replaceAll("([" + TONE_MARKS + "])(" + ASAT + ")", "$2$1");

        // Add space after ံ if not followed by 6 tone marks
        text = text.replaceAll("(\u1036)(?![" + TONE_MARKS + "])", "$1 ");

        // Break after tone marks
        text = text.replaceAll("([" + TONE_MARKS + ENG_CHAR + OTHER_CHAR + "])", "$1 ");

        // Break after consonant + vowel signs (various forms)
        text = text.replaceAll(
                "([" + CONSONANTS + "])" +
                        "([\u1062\u103d\u1082\u1031\u103b])?" +
                        "(\u1083|\u102e|\u1082\u103a|\u1086|\u1084|\u1031)" +
                        "(?![\u1087\u1088\u1038\u1089\u1037\u108a\u1083\u1031\u1083])",
                "$1$2$3 "
        );

        // Break after consonant + medial + ိ (if not special cases)
        text = text.replaceAll(
                "([" + CONSONANTS + "])" +
                        "([\u103b\u103c])?(\u102d)" +
                        "(?!(\u102f|\u1030|[" + CONSONANTS + "]" + ASAT + "))",
                "$1$2$3 "
        );

        // Break after consonant + medial ya (if not special cases)
        text = text.replaceAll(
                "([" + CONSONANTS + "])" +
                        "(\u103b)" +
                        "(?!(\u102f|\u1030|\u1083|\u102d|\u102e|\u1031|\u1084|\u1035|\u1085|\u103d|\u1062|\u103a|[" + CONSONANTS + "] + " + ASAT + "))",
                "$1$2 "
        );

        // Break after consonant + medial ya + e vowel
        text = text.replaceAll(
                "([" + CONSONANTS + "])(\u103b\u1031\u1083)(?!([" + TONE_MARKS + "]))",
                "$1$2 "
        );

        // Break after asat
        text = text.replaceAll("(" + ASAT + ")(?![" + TONE_MARKS + "])", "$1 ");

        // Break after consonant + ု / ူ (if not special cases)
        text = text.replaceAll(
                "([" + CONSONANTS + "])([\u103b\u103c])?(\u1030|\u102f)" +
                        "(?!(?:[" + TONE_MARKS + "]|[" + CONSONANTS + "]" + ASAT + "))",
                "$1$2$3 "
        );

        // Break between 3 consecutive consonants
        text = text.replaceAll(
                "([" + CONSONANTS + "])" +
                        "([" + CONSONANTS + "](?!" + ASAT + "))" +
                        "([" + CONSONANTS + "](?!" + ASAT + "))",
                "$1 $2 $3"
        );

        // Break between 2 consecutive consonants
        text = text.replaceAll(
            "([" + CONSONANTS + "])([" + CONSONANTS + "](?!" + ASAT + "))",
                "$1 $2"
        );
        // Normalize spaces
        text = text.replaceAll("( )+", " ");

        // Remove "null" if it accidentally appears
        text = text.replaceAll("null", "");

        return text.trim();
    }

    /** Fixes incorrect Shan character sequences */
    private static String purification(String input) {
        return input
                // ် + ႂ → ႂ + ်
                .replaceAll("(\u103a)(\u1082)", "$2$1")
                // ု + ိ → ိ + ု
                .replaceAll("(\u102f)(\u102d)", "$2$1")
                // ူ + ိ → ိ + ူ
                .replaceAll("(\u1030)(\u102d)", "$2$1");
    }
}
