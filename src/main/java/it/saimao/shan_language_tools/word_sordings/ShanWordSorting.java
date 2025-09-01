package it.saimao.shan_language_tools.word_sordings;

import it.saimao.shan_language_tools.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public final class ShanWordSorting implements Comparator<String> {

    // 1 to 19 -> C
    static String[] consonants = {
            "ၵ", "ၶ", "င", "ၸ", "သ", "ၺ",
            "တ", "ထ", "ၼ", "ပ", "ၽ", "ၾ",
            "မ", "ယ", "ရ", "လ", "ဝ", "ႁ", "ဢ"
    };

    static String asat = "\u103A";

    // V - 20 - 29
    static String[] vowels = {
            "ဢႃ", "ဢီ", "ဢေ", "ဢႄ", "ဢူ", "ဢူဝ်", "ဢေႃ", "ဢိုဝ်", "ဢိူဝ်", "ဢႂ်"
    };

    static String[] tones = {"ႇ", "ႈ", "း", "ႉ", "့", "ႊ"};

    // D - 30 - 37
    static String[] consonantsCombination = {
            "ၵ", "င", "ၺ", "တ", "ၼ", "ပ", "မ", "ဝ"
    };

    // ဢၢပ် ၊ ဢိပ် ၊ ဢဵပ် ၊ ဢႅပ် ၊ ဢုပ် ၊ ဢူပ် ၊ ဢွပ် ၊ ဢိုပ် ၊ ဢိူပ်
    static String[] deVowelizers = {
            "", "\u1062", "\u102D", "\u1035", "\u1085", "\u102F", "\u1030", "\u103D", "\u102D\u102F", "\u102D\u1030"
    };

    // ၵျ တြ ၵႂ ၵွ
    // CC - 38 - 41
    static String[] medians = {"ျ", "ြ", "ႂ်", "ႂ"};

    static List<String> tones1;
    static List<String> tones2;


    public static String compareWordString(String w1, String w2) {
        int compareWordInt = compareWordInt(w1, w2);
        if (compareWordInt == 1) return w2;
        else if (compareWordInt == -1) return w1;
        else return "Same Word";
    }

    public static int compareWordInt(String w1, String w2) {
        if (w1.equals(w2)) return 0;
        tones1 = new ArrayList<>();
        tones2 = new ArrayList<>();
        w1 = w1.replaceAll("ႆ", "ၺ်");
        w2 = w2.replaceAll("ႆ", "ၺ်");
        int maxWeight = 0;
        String[] ss1 = ShanRuleBasedSyllableSegmentation.segmentAsArray(w1);
        String[] ss2 = ShanRuleBasedSyllableSegmentation.segmentAsArray(w2);
        int lastIndex = Math.min(ss1.length, ss2.length);
        for (int i = 0; i < lastIndex; i++) {
            String s1 = ss1[i];
            String s2 = ss2[i];
            maxWeight = compareSyllable(s1, s2);
            if (maxWeight != 0) break;
//            if (maxWeight == 0) {
//                if (i == lastIndex - 1) {
//                    // Reach the end of a syllable
//                    maxWeight = compareValue(w1.length(), w2.length());
//                    break;
//                }
//            } else
//                break;
        }
        if (maxWeight == 0) {
            maxWeight = compareValue(w1.length(), w2.length());
            if (maxWeight == 0) {
                maxWeight = compareTone();
                if (maxWeight == 0) {
                    // Reach the end of a syllable
                    return compareValue(w1.length(), w2.length());
                }
            }
        }

        // Every word has the same weight
        // Check tones then
        // First check tones length, which one has more tones mean
        // it has to come after!

        return maxWeight;
    }

    private static int compareTone() {
        int maxWeight = 0;
        if (!tones1.isEmpty() && !tones2.isEmpty()) {
            maxWeight = compareValue(tones1.size(), tones2.size());
            if (maxWeight == 0) {
                for (int x = 0; x < tones1.size() && x < tones2.size(); x++) {
                    int t1 = getToneInt(tones1.get(x));
                    int t2 = getToneInt(tones2.get(x));
                    maxWeight = compareValue(t1, t2);
                    if (maxWeight != 0) break;
                }
            }
        }
        return maxWeight;
    }

    private static int compareSyllable(String s1, String s2) {
        int c1 = getConsonantWeight(s1);
        int c2 = getConsonantWeight(s2);
        int result = compareValue(c1, c2);
        if (result == 0) {
            int m1 = getMedianWeight(s1);
            int m2 = getMedianWeight(s2);
            result = compareValue(m1, m2);
            if (result == 0) {
                result = compareVowelWeight(s1, s2);
                if (result == 0) {
                    result = compareDevowelization(s1, s2);
                }
                return result;
            }
            return result;
        }
        return result;
    }

    private static int compareDevowelization(String s1, String s2) {
        // ၶၵ် လႄ ၶတ် - ၶၵ် တေလႆႈၶပ်းဢွၼ်တၢင်း
        int cc1 = getConsonantCombinationWeight(s1);
        int cc2 = getConsonantCombinationWeight(s2);
        int result = compareValue(cc1, cc2);
        if (result == 0) {
            // ၶုတ် လႄႈ ၶၢတ် - ၶၢတ် တေလႆႈမႃးဢွၼ်တၢင်း
            int d1 = getDevowelizationWeight(s1);
            int d2 = getDevowelizationWeight(s2);
            result = compareValue(d1, d2);
            // ၶၢတ်ႇ လႄႈ ၶၢတ်ႈ - ၶၢတ်ႇတေလႆႈမႃးဢွၼ်တၢင်း
            if ((d1 != -1 && d2 != -1) && result == 0) {
                addTones(s1, s2);
            }
            return result;
        }
        return result;
    }

    private static int getDevowelizationWeight(String s) {
        for (int i = 0, x = deVowelizers.length - 1; x >= 0; i++, x--) {
            String devowlizer = deVowelizers[x];
            if (s.contains(devowlizer)) return x;
        }

        return -1;
    }

    private static int getConsonantCombinationWeight(String s1) {
        int i = 0;
        for (String cc : consonantsCombination) {
            if (s1.contains(cc + asat)) return i;
            i++;
        }
        return -1;
    }

    private static int compareVowelWeight(String s1, String s2) {
        int v1 = getVowelWeight(s1);
        int v2 = getVowelWeight(s2);
        int result = compareValue(v1, v2);
        if ((v1 != -1 && v2 != -1) && result == 0) {
            addTones(s1, s2);
        }
        return result;
    }

    private static void addTones(String s1, String s2) {
        String t1 = getToneWeight(s1);
        if (t1 != null) tones1.add(t1);
        String t2 = getToneWeight(s2);
        if (t2 != null) tones2.add(t2);
    }

    private static String getToneWeight(String s) {
        for (String tone : tones) {
            if (s.contains(tone)) {
                return tone;
            }
        }
        return null;
    }

    private static int getToneInt(String s) {
        int i = 0;
        for (String tone : tones) {
            if (s.contains(tone)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static int getMedianWeight(String s1) {
        int i = 0;
        for (String median : medians) {
            if (s1.contains(median)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    private static String u = "ူ";

    private static int getVowelWeight(String syllable) {

        for (int i = vowels.length - 1; i >= 0; i--) {
            String vowel = vowels[i].substring(1);
            if (syllable.contains(vowel)) {
                /*
                ဢူ ၼႆႉ မီးလွင်ႈယူပ်ႈယွမ်းဝႆႉ
                ၵွပ်ႈပိူဝ် ဢူမ် ၊ ဢိူမ် ၸိူဝ်းၼႆႉ ၸၢင်ႊၶဝ်ႈမႃးလႆႈတီႈၼႆႈဢိူဝ်ႈ
                ၵွပ်ႈၼႆလႆႈၸႅတ်ႈဝႆႉဝႃႈ
                တူဝ်လိၵ်ႈႁဝ်းၼႆႉ တေဢမ်ႇလႆႈၼမ်သေ3တူဝ်ၼႆယဝ်ႉ
                ၵွပ်ႈပိူဝ် ဢူ၊ ဢူး ၼႆႉမီးလႆႈသၢမ်တူဝ်ၵူၺ်းသေ
                ဢူမ်၊ ဢိူမ်း ၸိူဝ်းၼႆႉ ၼမ်သေ သၢမ်တူဝ်ဝႆႉယဝ်ႉ။
                 */
                if (vowel.equals(u)) {
                    if (syllable.length() <= 3)
                        return i;
                } else return i;
            }
        }
        return -1;
    }

    private static int getConsonantWeight(String s) {
        String c = String.valueOf(s.charAt(0));
        return Arrays.asList(consonants).indexOf(c);
    }


    private static int compareValue(int v1, int v2) {
        if (v1 >= 0 && v2 >= 0) {
            if (v1 > v2) return 1;
            else if (v2 > v1) return -1;
            else return 0;
        } else if (v1 < 0 && v2 >= 0) {
            return 1;
        } else if (v2 < 0 && v1 >= 0) {
            return -1;
        } else return 0;
    }

    @Override
    public int compare(String o1, String o2) {
        return compareWordInt(o1, o2);
    }
}
