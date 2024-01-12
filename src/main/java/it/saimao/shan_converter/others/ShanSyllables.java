package it.saimao.shan_converter.others;

import java.util.List;
import java.util.stream.Stream;

/**
 * This program will output every possible Shan word that we can write!
 * Initially, intended to test for Shan Word Suggestion | Correction project (A dead project)
 *
 *
 */
public class ShanSyllables {
    String[] consonants = {
            "ၵ", "ၶ", "င", "ၸ", "သ", "ၺ",
            "တ", "ထ", "ၼ", "ပ", "ၽ", "ၾ",
            "မ", "ယ", "ရ", "လ", "ဝ", "ႁ", "ဢ"
    };

    String[] vowels = {
            "ဢ", "ဢႃ", "ဢီ", "ဢေ", "ဢႄ",
            "ဢူ", "ဢူဝ်", "ဢေႃ", "ဢိုဝ်", "ဢိူဝ်",
    };

    String[] meKaSon15 = {
            "ဢႆ", "ဢၢႆ", "ဢုၺ်", "ဢိူၺ်", "ဢွႆ",
            "ဢိုၺ်", "ဢိူၺ်",
            "ဢဝ်", "ဢၢဝ်", "ဢိဝ်",
            "ဢဵဝ်", "ဢႅဝ်", "ဢႂိုဝ်", "ဢႂိူဝ်", "ဢႂ်",
    };

    String[] toPhyatMa = {
            "ဢမ်", "ဢၢမ်", "ဢိမ်", "ဢဵမ်", "ဢႅမ်",
            "ဢုမ်", "ဢူမ်", "ဢွမ်", "ဢိုမ်", "ဢိူမ်",
    };

    String[] toPhyatNa = {
            "ဢၼ်", "ဢၢၼ်", "ဢိၼ်", "ဢဵၼ်", "ဢႅၼ်",
            "ဢုၼ်", "ဢူၼ်", "ဢွၼ်", "ဢိုၼ်", "ဢိူၼ်",
    };

    String[] toPhyatNga = {
            "ဢင်", "ဢၢင်", "ဢိင်", "ဢဵင်", "ဢႅင်",
            "ဢုင်", "ဢူင်", "ဢွင်", "ဢိုင်", "ဢိူင်",
    };

    String[] toPhyatPa = {
            "ဢပ်", "ဢၢပ်", "ဢိပ်", "ဢဵပ်", "ဢႅပ်",
            "ဢုပ်", "ဢူပ်", "ဢွပ်", "ဢိုပ်", "ဢိူပ်",
    };
    String[] toPhyatTa = {
            "ဢတ်", "ဢၢတ်", "ဢိတ်", "ဢဵတ်", "ဢႅတ်",
            "ဢုတ်", "ဢူတ်", "ဢွတ်", "ဢိုတ်", "ဢိူတ်",
    };
    String[] toPhyatKa = {
            "ဢၵ်", "ဢၢၵ်", "ဢိၵ်", "ဢဵၵ်", "ဢႅၵ်",
            "ဢုၵ်", "ဢူၵ်", "ဢွၵ်", "ဢိုၵ်", "ဢိူၵ်",
    };

    String[] toneMarks = {
           "ႇ", "ႈ", "း", "ႉ", "ႊ"
    };

    public List<String> steps = Stream.of(vowels, meKaSon15, toPhyatMa, toPhyatNa, toPhyatNga, toPhyatPa, toPhyatTa, toPhyatKa).flatMap(Stream::of).toList();

    public void getEveryPossibleShanWordThatWeCanWriteDown() {

        for (String consonant: consonants) {
            System.out.println(consonant);
            for (String a: vowels) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            for (String a: meKaSon15) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a: toPhyatMa) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a: toPhyatNa) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a: toPhyatNga) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            for (String a: toPhyatPa) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a: toPhyatTa) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();

            for (String a: toPhyatKa) {
                if (a.length() > 1) {
                    a = a.replaceAll("^.", consonant);
                    System.out.print(a);
                    for (String b: toneMarks) {
                        System.out.print(a + b);
                    }
                    System.out.println();
                }
            }
            System.out.println();
            System.out.println();
        }
    }

}
