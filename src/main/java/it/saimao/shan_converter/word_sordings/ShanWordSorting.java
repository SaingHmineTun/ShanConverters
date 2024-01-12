package it.saimao.shan_converter.word_sordings;

import it.saimao.shan_converter.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ShanWordSorting implements Comparator<String> {

    // 1 to 19 -> C
    static String[] consonants = {
            "ၵ", "ၶ", "င", "ၸ", "သ", "ၺ",
            "တ", "ထ", "ၼ", "ပ", "ၽ", "ၾ",
            "မ", "ယ", "ရ", "လ", "ဝ", "ႁ", "ဢ"
    };

    static String a = "ဢ";


    // V - 20 - 29
    static String[] vowels = {
        "ဢႃ", "ဢီ", "ဢေ", "ဢႄ", "ဢူ", "ဢူဝ်", "ဢေႃ", "ဢိုဝ်", "ဢိူဝ်"
    };

    static String[] tones = {"ႇ", "ႈ", "း", "ႉ", "့", "ႊ"};

    // D - 30 - 37
    static String[] deVowelizers = {
            "ၵ","င","ၺ", "တ","ၼ", "ပ", "မ","ဝ"
    };

    // ၵျ တြ ၵႂ ၵွ
    // CC - 38 - 41
    static String[] medians = {"ျ", "ြ", "ႂ", "ွ"};


    static List<String> weights = Stream.of(consonants, vowels, deVowelizers, medians).flatMap(Stream::of).toList();


    public static int compareWordInt(String w1, String w2) {
        int maxWeight = 0;
        String[] ss1 = ShanRuleBasedSyllableSegmentation.segmentAsArray(w1);
        String[] ss2 = ShanRuleBasedSyllableSegmentation.segmentAsArray(w2);
        int lastIndex = Math.min(ss1.length, ss2.length);
        for (int i = 0; i < lastIndex; i ++) {
            String s1 = ss1[i];
            String s2 = ss2[i];
            maxWeight = compareConsonantWeight(s1, s2);
            if (maxWeight == 0) {
                if (i == lastIndex - 1) {
                    // Reach the end of a syllable
                    return compareValue(w1.length(), w2.length());

                }
            }
            if (maxWeight != 0) break;
        }
        return maxWeight;
    }

    private static int compareConsonantWeight(String s1, String s2) {
        int c1 = getConsonantWeight(s1);
        int c2 = getConsonantWeight(s2);
        int result = compareValue(c1, c2);
        if (result == 0) {
            int m1 = getMedianWeight(s1);
            int m2 = getMedianWeight(s2);
            result = compareValue(m1, m2);
            if (result == 0) {
                int v1 = getVowelWeight(s1);
                int v2 = getVowelWeight(s2);
                result = compareValue(v1, v2);
            }
        }
        return result;
    }

    private static int getMedianWeight(String s1) {
        for (String median: medians) {
            if (s1.contains(median)) {
                return weights.indexOf(median);
            }
        }
        return -1;
    }


    private static int getVowelWeight(String syllable) {

        for (int i = vowels.length - 1; i >= 0; i --) {
            String vowel = vowels[i].substring(1);
            /*
            Cannot use equal, there can still be tones!!!
             */
            // ၵီ - ီ
            // ီ -
            if (syllable.contains(vowel)) {
                return weights.indexOf(a + vowel);
            }
        }
        return -1;
    }

    private static int getConsonantWeight(String s) {
        String c = String.valueOf(s.charAt(0));
        return weights.indexOf(c);
    }


    public static int compareValue(int v1, int v2) {
        return Integer.compare(v1, v2);

//        if (v1 > v2) return 1;
//        else if (v1 < v2) return -1;
//        else return 0;
    }

    @Override
    public int compare(String o1, String o2) {
        return compareWordInt(o1, o2);
    }
}
