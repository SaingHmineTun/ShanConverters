package it.saimao.shan_converter.breakers;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TaiLeSyllableSegmentation {

    public static String CONSONANTS = "\u1950-\u1962";
    public static final String ENG_CHAR = "a-zA-Z0-9";
    // "!-/:-@[-`{-~\s"
    public static final String OTHER_CHAR = "\u1040-\u1049\u104a\u104b!-/:-@\\[-`\\{-~\\s";
    public static final String TONE_MARKS = "\u1970-\u1974";

    public static final String BREAK_PATTERN = "([" + CONSONANTS + "](?![" + TONE_MARKS + "])|[" + ENG_CHAR + OTHER_CHAR + "])";
    public static synchronized String[] segment(String text) {
        if (text == null) {
            throw new NullPointerException();
        }
        return text.replaceAll(BREAK_PATTERN, "\uD835\uDD4A$1").split("\uD835\uDD4A");
    }

    public static synchronized String segmentAsStringWithDelimiter(String text, String delimiter)  {
        String[] outputs = segment(text);
        String segmentString = Arrays.stream(outputs)
                .map(s -> s.concat(delimiter))
                .collect(Collectors.joining())
                // In Tai Le, There's no single consonant standing
                .replaceAll("(" + delimiter + ")([" + CONSONANTS + "])(" + delimiter + ")", "$2$3")
                .replaceAll("(" + delimiter + ")+", "$1");
        return segmentString.trim();
    }

    public static String segmentAsString(String input) {
        return segmentAsStringWithDelimiter(input, " ");
    }
}
