package it.saimao.shan_language_tools.others;

import java.util.List;
import java.util.stream.Stream;

/**
 * This program will output every possible Shan word that we can write!
 * Initially, intended to test for Shan Word Suggestion | Correction project (A dead project)
 *
 *
 */
public class ShanSyllables {
    public static final String[] CONSONANTS = {
            "ၵ", "ၶ", "င", "ၸ", "သ", "ၺ",
            "တ", "ထ", "ၼ", "ပ", "ၽ", "ၾ",
            "မ", "ယ", "ရ", "လ", "ဝ", "ႁ", "ဢ"
    };

    public static final String[] NUMBERS = {"႐", "႑", "႒", "႓", "႔", "႕", "႖", "႗", "႘", "႙"};
    ;

    public static final String[] VOWELS = {
            "ဢ", "ဢႃ", "ဢီ", "ဢေ", "ဢႄ",
            "ဢူ", "ဢူဝ်", "ဢေႃ", "ဢိုဝ်", "ဢိူဝ်",
    };

    public static final String[] ME_KAP_SON_15 = {
            "ဢႆ", "ဢၢႆ", "ဢုၺ်", "ဢိူၺ်", "ဢွႆ",
            "ဢိုၺ်", "ဢိူၺ်",
            "ဢဝ်", "ဢၢဝ်", "ဢိဝ်",
            "ဢဵဝ်", "ဢႅဝ်", "ဢႂိုဝ်", "ဢႂိူဝ်", "ဢႂ်",
    };

    public static final String[] TO_PHYAT_MA = {
            "ဢမ်", "ဢၢမ်", "ဢိမ်", "ဢဵမ်", "ဢႅမ်",
            "ဢုမ်", "ဢူမ်", "ဢွမ်", "ဢိုမ်", "ဢိူမ်",
    };

    public static final String[] TO_PHYAT_NA = {
            "ဢၼ်", "ဢၢၼ်", "ဢိၼ်", "ဢဵၼ်", "ဢႅၼ်",
            "ဢုၼ်", "ဢူၼ်", "ဢွၼ်", "ဢိုၼ်", "ဢိူၼ်",
    };

    public static final String[] TO_PHYAT_NGA = {
            "ဢင်", "ဢၢင်", "ဢိင်", "ဢဵင်", "ဢႅင်",
            "ဢုင်", "ဢူင်", "ဢွင်", "ဢိုင်", "ဢိူင်",
    };

    public static final String[] TO_PHYAT_PA = {
            "ဢပ်", "ဢၢပ်", "ဢိပ်", "ဢဵပ်", "ဢႅပ်",
            "ဢုပ်", "ဢူပ်", "ဢွပ်", "ဢိုပ်", "ဢိူပ်",
    };
    public static final String[] TO_PHYAT_TA = {
            "ဢတ်", "ဢၢတ်", "ဢိတ်", "ဢဵတ်", "ဢႅတ်",
            "ဢုတ်", "ဢူတ်", "ဢွတ်", "ဢိုတ်", "ဢိူတ်",
    };
    public static final String[] TO_PHYAT_KA = {
            "ဢၵ်", "ဢၢၵ်", "ဢိၵ်", "ဢဵၵ်", "ဢႅၵ်",
            "ဢုၵ်", "ဢူၵ်", "ဢွၵ်", "ဢိုၵ်", "ဢိူၵ်",
    };

    public static final String[] TONE_MARKS = {
            "ႇ", "ႈ", "း", "ႉ", "ႊ"
    };

    private static List<String> steps = Stream.of(VOWELS, ME_KAP_SON_15, TO_PHYAT_MA, TO_PHYAT_NA, TO_PHYAT_NGA, TO_PHYAT_PA, TO_PHYAT_TA, TO_PHYAT_KA).flatMap(Stream::of).toList();

    public static void getEveryPossibleShanWordThatWeCanWriteDown() {

        for (String consonant : CONSONANTS) {
            System.out.println(consonant);
            for (String a : VOWELS) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            for (String a : ME_KAP_SON_15) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a : TO_PHYAT_MA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a : TO_PHYAT_NA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a : TO_PHYAT_NGA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            for (String a : TO_PHYAT_PA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a : TO_PHYAT_TA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a : TO_PHYAT_KA) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b : TONE_MARKS) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();
        }
    }

    public static String convertEngToShanNumber(String number) {
        StringBuilder output = new StringBuilder();
        for (char ch : number.toCharArray()) {
            int index = ch - '0';
            output.append(NUMBERS[index]);
        }
        return output.toString();
    }

    public static String convertEngToShanNumber(int number) {
        return convertEngToShanNumber(String.valueOf(number));
    }

    public static String convertShanToEngNumberAsString(String shanNumber) {
        StringBuilder output = new StringBuilder();
        for (char ch: shanNumber.toCharArray()) {
            output.append(ch - '႐');
        }
        return output.toString();
    }

    public static int convertShanToEngNumberAsInt(String shanNumber) {
        String output = convertShanToEngNumberAsString(shanNumber);
        return Integer.parseInt(output);
    }

    public static boolean isShanNumber(String param) {
        var numbers = param.split("");
        for (var num : numbers) {
            if (List.of(NUMBERS).contains(num)) continue;
            return false;
        }
        return true;
    }

    public static boolean isShanConsonant(String param) {
        var text = param.split("");
        for (var txt : text) {
            if (List.of(CONSONANTS).contains(txt)) continue;
            return false;
        }
        return true;
    }

}
