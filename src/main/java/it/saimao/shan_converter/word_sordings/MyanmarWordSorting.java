package it.saimao.shan_converter.word_sordings;

import it.saimao.shan_converter.breakers.MyanmarSyllableSegmentation;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * Based on Myanmar Word Sorting - Su Mon Khine, Yadana Thein
 * that was used to sort Myanmar Zawgyi
 * ==========================================================
 * Myanmar script is composed of
 * 1. Consonants - 33
 * က ခ ဂ ဃ င
 * စ ဆ ဇ ဈ ည
 * ဋ ဌ ဍ ၒ ဏ
 * တ ထ ဒ ဓ န
 * ပ ဖ ဗ ဘ မ
 * ဘ ရ လ ဝ သ
 * ဟ ဠ အ
 * <p>
 * 2. Vowels - 23
 * အာ အါ အိ အီ အု အူ အေ အဲ အံ အ့ အး အ်
 * အား အာ့ အါး အါ့ အီး အီ့ အူး အူ့ အေး အေ့ အဲ့
 * <p>
 * 3. De-vowelizer - 38
 * Virama + Consonant
 * <p>
 * 4. Median - 11
 * ကျ ၊ ကြ ၊ ကွ ၊ ကှ ၊ ကျွ ၊ ကြွ ၊ ကွှ ၊ ကျှ ၊ ကြှ ၊ ကျွှ ၊ ကြွှ
 * ====================================================
 *
 *
 * Myanmar sentences are usually separated with poke-kalay (၊), poke-ma(။) or space!
 * But there is no rule for word breaking!
 * မြန်မာစာ word တစ်ခုကို consonant, vowel, de-vowelizer, median တွေနဲ့ ဖွဲ့စည်းထားလေ့ ရှိတယ်။
 * မြန်မာစာ word တစ်လုံးကို အောက်ပါအတိုင်း အမျိုးအစား ၄ မျိုး ခွဲနိုင်တယ်။
 * ၁) Simple Word - လ ၊ ဝက်ဝံ
 * ၂) Compond Word - ရေနွေးအိုး (ရေနွေး + အိုး)
 * ၃) Pali Word - ပြက္ခဒိန်
 * ၄) Loan Word - ကွန်ပျူတာ ၊ ရေဒီယို
 * ======================================================
 *
 *
 * Algorithm တည်ဆောက်ထားပုံ
 * ပထမဦးစွာ C, V, D, M တွေကို Weight သတ်မှတ်ပါတယ်
 * a) C - 33 (1 - 33)
 * b) V - 23 (34 - 56)
 * c) D - 38 (57 - 94)
 * d) M - 11 (95 - 105)
 * <p>
 * ဒုတိယအဆင့်အနေနဲ့ နှိုင်းယှဉ်မဲ့ word တွေကို syllable အဖြစ် ခွဲထုတ်လိုက်ပါတယ်
 * ပြီးရင် weight တွက်ပြီး စီပါမယ်
 * ၁။ syllable ကို C, V, D, M အဖြစ် ထပ်ခွဲပါမယ်
 * ၂။ syllable 2 ခုလုံးရဲ့ ပထမဆုံးစာလုံး C ရဲ့ ဝိတ်နဲ့ အရင်ဆုံးး နှိုင်းပါမယ်။
 * ၃။ ဝိတ်တူနေသေးရင် Median ဝိတ်နဲ့ ထပ်နှိုင်းပါမယ်။
 * ၄။ ဒါကိုမှထပ်တူနေရင် De-vowelizer ၊ ထပ်တူနေသေးရင် vowel တွေနဲ့ ထပ်နှိုင်းပါမယ်။
 * ၅။ ဒီအတိုင်း word တခုရဲ့ syllable တွေကို တဆင့်ပြီးတဆင့် နှိုင်းယှည်သွားပါမယ်။
 * <p>
 * Algorithm MW_Sorting (W1, W2)
 * 1. Assign weight to C, V, D, M in ascending order
 * 2. MaxW = Omega
 * 3. S1(S1W1, S2W1, SnW1), S2 (S1W2, S2W2, SnW2) # Input words word segmented into syllable
 * 4. for (k=0; k < min(W1,W2).length-1; k++) {
 * 5.       result <- Compare_Syll(SkW1, SkW2)
 * 6.       if (result == 3) then MaxW = W1 break;
 * 7.       if (result == 2) then MaxW = W2 break;
 * 8.       if (result == 1) then
 * 9.            if(k is last index) then
 * 10.                if (W1.length == W2.length) then W1 is equal to W2
 * 11.               else if (W1.length > W2.length) then MaxW = W1
 * 12.               else MaxX = W2
 * 13. end for
 * 14. return MaxW
 * <p>
 * Function Compare_Syll (S1W1, S1W2)
 * 1. s1w1 = [C,V,D,M] # Separate each syllable into 4 parts
 * s1w2 = [C,V,D,M]
 * 2. result = compareVal(s1w1[C], s1w2[C])
 * 3. if (result == 1) then
 * 4.   for (k = s1w1.length - 1; k > 0; k --) do
 * 5.       result = compareVal(s1w1[k], s1w2[k])
 * 6.           if (result != 1) then
 * 7.               goto 10
 * 8.   end for
 * 9. end if
 * 10. return result
 * <p>
 * <p>
 * Function compareVal(v1, v2)
 * 1. if (v1>v2) then result = 3; # Compare their weight
 * 2. if (v1<v2) hen result = 2;
 * 3. else result = 1;
 * 4. return result
 */
public class MyanmarWordSorting implements Comparator<String> {
    String[] consonants = {
            "က", "ခ", "ဂ", "ဃ", "င",
            "စ", "ဆ", "ဇ", "ဈ", "ည",
            "ဋ", "ဌ", "ဍ", "ၒ", "ဏ",
            "တ", "ထ", "ဒ", "ဓ", "န",
            "ပ", "ဖ", "ဗ", "ဘ", "မ",
            "ယ", "ရ", "လ", "ဝ", "သ",
            "ဟ", "ဠ", "အ",
    };
    /*
     * အာ အါ အိ အီ အု အူ အေ အဲ အံ အ့ အး အ်
     * အား အာ့ အါး အါ့ အီး အီ့ အူး အူ့ အေး အေ့ အဲ့
     */
    String[] vowels = {
            "ာ", "ါ", "ိ", "ီ", "ု",
            "ူ", "ေ", "ဲ", "ံ", "့",
            "း", "်", "ား", "ာ့", "ါး",
            "ါ့", "ီး", "ီ့", "ူး", "ူ့",
            "ေး", "ေ့", "ဲ့",
    };

    String[] deVowelizer = {"္"};

    /*
     * ကျ ၊ ကြ ၊ ကွ ၊ ကှ ၊ ကျွ ၊ ကြွ ၊ ကွှ ၊ ကျှ ၊ ကြှ ၊ ကျွှ ၊ ကြွှ
     */
    String[] median = {
            "ျ", "ြ", "ွ", "ှ", "ြွ",
            "ျွ", "ွှ", "ျှ", "ြှ", "ျွှ", "ြွှ"
    };

    List<String> weights = Stream.of(consonants, vowels, deVowelizer, median).flatMap(Stream::of).toList();

    /*
     * Algorithm MW_Sorting (W1, W2)
     * 1. Assign weight to C, V, D, M in ascending order
     * 2. MaxW = Omega
     * 3. S1(S1W1, S2W1, SnW1), S2 (S1W2, S2W2, SnW2) # Input words word segmented into syllable
     * 4. for (k=0; k < min(W1,W2).length-1; k++) {
     * 5.       result <- Compare_Syll(SkW1, SkW2)
     * 6.       if (result == 3) then MaxW = W1 break;
     * 7.       if (result == 2) then MaxW = W2 break;
     * 8.       if (result == 1) then
     * 9.            if(k is last index) then
     * 10.                if (W1.length == W2.length) then W1 is equal to W2
     * 11.               else if (W1.length > W2.length) then MaxW = W1
     * 12.               else MaxX = W2
     * 13. end for
     * 14. return MaxW
     */

    public String MW_Sorting(String w1, String w2) {
        String maxW = null;

        // Break word into syllables!
        List<String> s1 = MyanmarSyllableSegmentation.segment(w1);
        List<String> s2 = MyanmarSyllableSegmentation.segment(w2);

        int lastIndex = Math.min(s1.size(), s2.size());
        for (int k = 0; k < lastIndex; k++) {
            int result = compareSyll(s1.get(k), s2.get(k));
            if (result == 2) {
                maxW = w1;
                break;
            } else if (result == 3) {
                maxW = w2;
                break;
            } else if (result == 1) {
                if (k == lastIndex - 1) {
                    if (w1.length() == w2.length()) return "W1 is Equal to W2";
                    else if (w1.length() > w2.length()) {
                        maxW = w2;
                        break;
                    } else {
                        maxW = w1;
                        break;
                    }
                }
            }
        }
        return maxW;
    }


    private int compareSyll(String s1, String s2) {
//        String[] c1 = s1.split("");
//        String[] c2 = s2.split("");
        // Compare Consonant
        int result = compareWeight(String.valueOf(s1.charAt(0)), String.valueOf(s2.charAt(0)));
        if (result == 1) {
            result = compareMedian(s1, s2);
            if (result == 1) {
                result = compareVowel(s1, s2);
            }
        }
        return result;
    }

    public int getMedianWeight(String syllable) {
        for (int i = median.length - 1; i >= 0; i --) {
            if (syllable.contains(median[i])) {
                return weights.indexOf(median[i]);
            }
        }
        return -1;
    }

    public int getVowelWeight(String syllable) {
        for (int i = vowels.length - 1; i >= 0; i --) {
            if (syllable.contains(vowels[i])) {
                return weights.indexOf(vowels[i]);
            }
        }
        return -1;
    }

    public int compareVowel(String s1, String s2) {
        int v1 = getVowelWeight(s1);
        int v2 = getVowelWeight(s2);
        return compareValue(v1, v2);
    }

    public int compareMedian(String s1, String s2) {
        int m1 = getMedianWeight(s1);
        int m2 = getMedianWeight(s2);
        return compareValue(m1, m2);
    }

    public int compareValue(int v1, int v2) {
        if (v1 > v2) return 2;
        else if (v1 < v2) return 3;
        else return 1;
    }

    private int compareWeight(String c1, String c2) {
        int w1 = weights.indexOf(c1);
        int w2 = weights.indexOf(c2);
        if (w1 > w2) return 3;
        else if (w1 < w2) return 2;
        else return 1;
    }

    @Override
    public int compare(String o1, String o2) {
        String first = MW_Sorting(o1, o2);
        System.out.println(o1 + " vs " + o2 + " = " + first);
        if (first.equals(o1)) return -1;
        else if (first.equals(o2)) return 1;
        return 0;
    }
}
