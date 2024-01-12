package it.saimao.shan_converter.breakers;

/**
 * Shan Text
 * 	လိၵ်ႈတႆးၼႆႉ တူဝ်ယဝ်ႉတူဝ် ဢမ်ႇၸႂ်ႉ space သေၸႅၵ်ႇၵၼ်ဝႆႉ မိူၼ်ၸိူင်ႉ လိၵ်ႈဢၢင်းၵိတ်ႈ။ Space ၼႆႉ ၸႂ်ႉတိုဝ်းတီႈ Phrase ၵူၺ်း။ Sentence လိၵ်ႈတႆးၼႆႉ ပေႃးယဝ်ႉၵႂႃႇၼိုင်ႈထႅဝ်ၼႆ ဢဝ် Punctuation ( ၊ ။ ) သေၸႅၵ်ႇၵၼ်ဝႆႉယဝ်ႉ။ Sentencne ၸိူဝ်းၼႆႉ မႃးႁူမ်ၵၼ်သေ ပဵၼ်Paragraph ယဝ်ႉ။ Paragraph ဢၼ်လႄႈဢၼ်ၼႆႉတေႉ ၸႂ်ႉတိုဝ်း Enter ႁေ Tab ႁေ ၸႅၵ်ႇၵၼ်ဝႆႉလႄႈ ၼႆႉတေ မိူၼ်ၵၼ်တင်း ပိူင်ဢၢင်းၵိတ်ႈယူႇ။
 *
 * ၵွပ်ႈၼႆ လိၵ်ႈတႆးၼႆႉ ပေႃးမႃးတူၺ်းလီလီၼႆ
 * Text => Paragraph => Sentence => Phrase => Syllable => Character
 *
 * Shan Syllable
 * 	တူဝ်လိၵ်ႈၼိုင်ႈတူဝ်ၼႆႉ ဢဝ် Consonant သေတေႇဝႆႉယဝ်ႉ။ ဝၢႆးၼၼ်ႉ ၶိုၼ်းၵပ်းၵၼ်တၢင်း Vowel, Median, Tone Marks ၸိူဝ်းၼႆႉသေ ပဵၼ်မႃး တူဝ်လိၵ်ႈၼိုင်ႈတူဝ်ယဝ်ႉ။
 * 	ၼႂ်းတူဝ်လိၵ်ႈတႆးၼိုင်ႈတူဝ်ၼႆႉ ပေႃးမႃးၸႅၵ်ႇၽႄ တူၺ်းလီလီၼႆ တေလႆႈႁၼ်ၸိူဝ်းၼႆႉယူႇ။
 *
 * Consonant - တူဝ်မႄႈလိၵ်ႈတႆး(19)တူဝ်
 * 	တူဝ်လိၵ်ႈပႃႇလိၸိူဝ်းၼႆႉတေႉ ပႆႇလႆႈႁဵၼ်းလီလီလႄႈ တီႈၽိုၼ်လိၵ်ႈၼႆႉ ဢမ်ႇလႆႈသႂ်ႇပႃးဝႆႉ။ ၵွပ်ႈၼႆ တူဝ်မႄႈလိၵ်ႈ တေမီးဝႆႉယူႇ 19 တူဝ်။ Unicode Point မၼ်းတေႉၵေႃႈ ၵွပ်ႈၸႂ်ႉလေႃးၵၼ်ဝႆႉတၢင်း လိၵ်ႈမၢၼ်ႊႁေ ဢမ်ႇၶပ်ႉၵၼ်ဝႆႉ ပႅင်ၼင်ႇ Ascending Order မၼ်း။ မိူၼ်ၼင်ႇ တူဝ် “င“(\u1004) ၼႆႉ တီႈတေႉ တေလႆႈယူႇဝႆႉတီႈၽၢႆႇလင် တူဝ် “ၶ“ (\u1076) သေတႃႉ ၵွပ်ႈၸႂ်ႉႁူမ်ႈၵၼ်တင်း မၢၼ်ႊဝႆႉလႄႈ မၼ်းယူႇဝႆႉတီႈ ႁူဝ်ၼႃႈ “ၶ“ ဝႆႉယဝ်ႉ။
 *
 *  Consonant = ၵ ၶ င ၸ သ ၺ တ ထ ၼ ပ ၽ ၾ မ ယ ရ လ ဝ ႁ ဢ
 *
 * Median
 *  M - Median(4) = ဢျ ဢြ ဢႂ ဢွ
 *
 * Dependent Vowels Sign
 * 	တူဝ်တၢင်းမူတ်း တေလႆႈၸႂ်ႉၸွမ်း Consonant ယဝ်ႉ။ ပေႃးၸႅၵ်ႇၸႅတ်ႈတူၺ်းလီလီၼႆၸိုင် မၼ်းၵေႃႈမီးဝႆႉယူႇ 13 တူဝ်ယူႇ။
 *
 * Vowels Sign = ဢႃ ဢီ ဢႄ ဢေႃ | ဢု ဢူ | ဢေ | ဢၢ ဢိ ဢဵ ဢႅ ဢို ဢိူ
 *
 * 	ၼႂ်း 13 တူဝ်ၼႆႉ တႃႇတေၸႂ်ႉတိုဝ်းလႆႈတီႈ Segmentation ႁဝ်းၼႆၸိုင် ၶႃႈၶိုၼ်ႈဢဝ်ႁဵတ်ႉပဵၼ် Group (4)ဢၼ်ဝႆႉယူႇ။
 *
 *     1. D – Independent Vowel = ဢႃ ဢီ ဢႄ ဢေႃ (They are used alone)
 * 		    သရ(4) တူဝ်ၼႆႉတေႉ ၽၢႆႇၶႂႃမၼ်း လိူဝ်သေ ဢမ်ႇမီးလႆႈ တူၼ်းသဵင်သင်ယဝ်ႉ။ ၵွပ်ႈၼႆ ပေႃးႁၼ်သီတူဝ်ၼႆႉၼႆၸိုင် ပေႃးတီႈၽၢႆႇၶႂႃႇၶဝ် ဢမ်ႇမီးတူၼ်းသဵင်သင်ၼႆ ၸႅၵ်ႇလႆႈၵမ်းလဵဝ်ယူႇ။ မိူၼ်ၼင်ႇ
 *          မႃမီမေႃသႄ ၸႅၵ်ႇပဵၼ် မႃ မီ မေႃ သႄ
 *     2. E – Vowel = ဢု (ဢႃႇယု) ဢူ (ဢမ်ႇၼၼ်) ဢုမ် ဢူမ်  (Used alone or combine with other consonants)
 * 		    သရ သွင်တူဝ်ၼႆႉတေ ပဵၼ်လႆႈ သွင်ပိူင် ၊
 *     3. F – Vowel = ဢေ (ဢမ်ႇၼၼ်) ဢေႃ
 *     4. G – Dependent Vowel =  ဢၢ ဢိ ဢဵ ဢႅ (Alone, they do not have any meaning, need to combine with other consonants)
 *
 * A - Asat = ဢ်
 * S - Dependent Various Sign = ဢႆ (ဢၺ်)
 * T - Shan tone marks(5) = ႇ ႈ း ႉ ႊ
 * I - Independent Vowel(2) =
 * N - Number(10) = 0 1 2 3 4 5 6 7 8 9
 * P - Punctuation(2) = ၊ ။
 */
public class ShanRuleBasedSyllableSegmentation {
    // Consonants that are used to combine with Asat
    static String consonantCombination = "မၼငပတၵၺဝ";

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
                .replaceAll("\\u0020+", "\u0020");

        return output;
    }


}
