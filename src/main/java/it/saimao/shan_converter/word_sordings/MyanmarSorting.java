package it.saimao.shan_converter.word_sordings;

import it.saimao.shan_converter.breakers.MyanmarSyllableSegmentation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * အက္ခရာစဉ်ရာတွင် အဆင့် ၄ ဆင့် ရှိသည်။
 * ၁။ ဗျည်းစဉ်
 * ၂။ သရစဉ်
 * ၃။ အသတ်စဉ်
 * ၄။ ဗျည်းတွဲစဉ်
 * <p>
 *
 * ၁။ ဗျည်းစဉ်
 * မြန်မာအက္ခရာ (က) မှ (ဠ) အထိ ဗျည်း(၃၃)လုံးကို အစဉ်အတိုင်း စဉ်ခြင်းဖြစ်သည်။
 * အ သံထွက်သော သရများကိုမူ ဗျည်းများပြီးမှ စဉ်ရသည်။
 * <p>
 *
 * ၂။ သရစဉ်
 * ဗျည်းများကို အသံထွက်ရွတ်ဆိုရန် သက်ဆိုင်ရာဗျည်းကို သရနှင့် ပေါင်းပေးရသည်။
 * သရ(၈)လုံးကိုပွားလျှင်(၂၂)လုံး ရသည်။
 * သရ(၈)လုံး - အ၊ အိ၊ အု၊ အေ၊ အဲ၊ အော၊ အံ၊ အို
 *
 * ၃။ အသတ်စဉ်
 * အသတ်စဉ်သည် ဗျည်းစဉ်ကိုလည်းကောင်း ၊ သရစဉ်ကိုလည်းကောင်း အခြေခံထားသည်။
 *
 */
public class MyanmarSorting implements Comparator<String> {
    String[] consonantList = {
            "က", "ခ", "ဂ", "ဃ", "င",
            "စ", "ဆ", "ဇ", "ဈ", "ဉ", "ည",
            "ဋ", "ဌ", "ဍ", "ၒ", "ဏ",
            "တ", "ထ", "ဒ", "ဓ", "န",
            "ပ", "ဖ", "ဗ", "ဘ", "မ",
            "ယ", "ရ", "လ", "ဝ", "သ",
            "ဟ", "ဠ", "အ"
    };

    String[] vowelList = {
            "အာ", "အား",
            "အိ", "အီ", "အီး",
            "အု", "အူ", "အူး",
            "အေ", "အေ့", "အေး",
            "အဲ", "အဲ့",
            "အော", "အော့", "အော်",
            "အံ", "အံ့",
            "အို", "အို့", "အိုး"
    };

    String[] asatList = {
            "အက်", "အိက်", "အုက်", "အောက်", "အိုက်",
            "အင်", "အင့်", "အင်း", "အောင်", "အောင့်", "အောင်း", "အိုင်", "အိုင့်", "အိုင်း",
            "အစ်",
            "အည်", "အည့်", "အည်း",
            "အတ်", "အိတ်", "အုတ်",
            "အန်", "အန့်", "အန်း", "အိန်", "အိန့်", "အိန်း",
            "အပ်", "အိပ်", "အုပ်",
            "အမ်", "အမ့်", "အမ်း", "အိမ်", "အိမ့်", "အိမ်း", "အုမ်", "အုမ်", "အုမ်း",
            "အယ်", "အယ့်",
    };

    String[] median = {
            "အျ", "အြ", "အွ", "အှ", "အြွ",
            "အျွ", "အွှ", "အျှ", "အြှ", "အျွှ", "အြွှ"
    };

    List<String> weights = Stream.of(consonantList, vowelList, asatList).flatMap(Stream::of).toList();

    public int sortMyanmarWord(String w1, String w2) {
        int result = 0;
        List<String> s1 = MyanmarSyllableSegmentation.segment(w1);
        List<String> s2 = MyanmarSyllableSegmentation.segment(w2);
        int defineLastIndex = Math.min(s1.size(), s2.size());
        for (int i = 0; i < defineLastIndex; i++) {
            result = compareConsonant(s1.get(i), s2.get(i));
            if (result == 0) {
                result = compareVowel(s1.get(i), s2.get(i));
                if (result == 0) {
                    result = compareAsat(s1.get(i), s2.get(i));
                    if (result != 0) break;
                }
                if (result != 0) break;
            }
            if (result != 0) break;
            if (i == (defineLastIndex - 1)) {
                result = compareValue(s1.size(), s2.size());
            }
        }
        return result;
    }

    private int compareAsat(String s, String s1) {
        int a1 = getAsatWeight(s);
        int a2 = getAsatWeight(s1);
        return compareValue(a1, a2);
    }

    private int getAsatWeight(String s) {
        s = s.replaceAll("^.", "အ");
        for (int i = asatList.length - 1; i >= 0; i--) {
            String vowel = asatList[i];
            if (s.equals(vowel)) {
                return weights.indexOf(asatList[i]);
            }
        }
        return -1;
    }

    private int compareVowel(String s1, String s2) {
//        if (s1.length() == 1) return -1;
//        else if (s2.length() == 1) return 1;
        int w1 = getVowelWeight(s1);
        int w2 = getVowelWeight(s2);
        return compareValue(w1, w2);
    }

    private int getVowelWeight(String s) {

        s = s.replaceAll("^.", "အ");
        for (int i = vowelList.length - 1; i >= 0; i--) {
            String vowel = vowelList[i];
            if (s.equals(vowel)) {
                return weights.indexOf(vowelList[i]);
            }
        }
        return -1;
    }

    // Return first-come word
    public String sortConsonantString(String w1, String w2) {
        int result = sortMyanmarWord(w1, w2);
        if (result < 0) return w1;
        else if (result > 0) return w2;
        else return "Same";
    }

    private int compareConsonant(String s1, String s2) {
        String c1 = String.valueOf(s1.charAt(0));
        String c2 = String.valueOf(s2.charAt(0));
        int w1 = weights.indexOf(c1);
        int w2 = weights.indexOf(c2);
        return compareValue(w1, w2);
    }


    private int compareValue(int v1, int v2) {
        return Integer.compare(v1, v2);
        /*
        if (v1 > v2) return 1;
        else if (v1 < v2) return -1;
        else return 0;
         */
    }

    @Override
    public int compare(String o1, String o2) {
        return sortMyanmarWord(o1, o2);
    }
}
