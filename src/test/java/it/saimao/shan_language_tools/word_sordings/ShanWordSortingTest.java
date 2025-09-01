package it.saimao.shan_language_tools.word_sordings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ShanWordSortingTest {
    @Test
    public void testConsonantSorting() {
        List<String> strings = Arrays.asList("ၵ", "ၵၶ", "တတ", "တၼ", "ၼ", "ပ", "ႁ", "ၶ", "လ");
        printData(strings);
    }

    @Test
    public void testMedianSorting() {
        List<String> strings = Arrays.asList("ၶျၢင်း","ၶႂၢင်း","ၶွင်ႉ", "ၶြႃႊ", "ၽြႃး", "တြႃး", "သြႃႇ", "ၶျႃး", "ၶျီး");
        printData(strings);
    }

    private void printData(List<String> strings) {
        strings.forEach(s -> System.out.print(s + " "));
        strings.sort(new ShanWordSorting());
        System.out.println();
        strings.forEach(s -> System.out.print(s + " "));
    }

    @Test
    public void testVowelSorting() {
        List<String> strings = Arrays.asList("ၵႃ", "ၵီ", "ၵူ", "ၵိုဝ်", "ၵိူဝ်", "ၵေ", "ၵူဝ်", "ၵႄ", "ၵေႃ");
        printData(strings);
//        printData(Arrays.asList("ဢေႃ", "ဢူဝ်", "ဢူ"));

    }

    @Test
    public void testVowelSortingTones() {
        List<String> strings = Arrays.asList("ၵႃႊ", "ၵႃး", "ၶိူဝ်း", "ၶိူဝ်ႉ", "ၶိူဝ်ႈ", "ၵႃႈ", "မေႃ", "မေႃး", "လိုၼ်း", "လိုၼ်");
        printData(strings);
    }

    @Test
    public void testConsonantCombination() {
        List<String> strings = Arrays.asList("ၶမ်", "ၶမ်း", "ၶၼ်ႉ", "ၶၼ်ႇ", "ၶင်", "ၶၵ်", "ၶတ်", "ၶတ်း", "ၶတ်ႇ", "ၶတ်ႈ");
        printData(strings);
    }

    @Test
    public void testDevowelizition() {
        List<String> strings = Arrays.asList("ၶၢတ်", "ၶိတ်", "ၶိုတ်", "ၶဵတ်", "ၶုတ်", "ၶူတ်", "ၶိူတ်", "ၶတ်", "ၶႅတ်", "ၶွတ်");
        printData(strings);
    }

    @Test
    public void testMedian() {
        printData(Arrays.asList("ၶွတ်", "ၶၢတ်", "ၶျၢင်း"));
    }

    // Bug
    @Test
    public void testReplaceKaikhin() {
        printData(Arrays.asList("ၵႆ", "ၵၢႆး", "ၶွႆ", "ၶွႆႈ", "ၶႆႇ"));
    }

    // Bug
    @Test
    public void testDevowelizationWithTones() {
        printData(Arrays.asList("ၶၢတ်", "ၶၢတ်း", "ၶုတ်ႉ", "ၶုၼ်း", "ၶုၵ်ႉ", "ၶူၵ်ႉ", "ၶူၵ်", "ၶိူၵ်"));
//        printData(Arrays.asList("ၶၢတ်", "ၶုၵ်း"));
    }

    @Test
    public void testText1() {
        printData(Arrays.asList("ၵႃႇလႃး", "ၵတ်ႉၶႅၼ်ႇ", "ၵႂ်ႊႁႅင်းဝႆႉ", "ၵြႃးပဵၼ်ၵလေး", "ၵျမ်းတေႉ", "ၵျေႃႇတေႉ", "ၵႃးပလိၵ်ႈ", "ၵႃးထႆး"));
    }

    @Test
    public void testText2() {
        printData(Arrays.asList("ႁူဝ်ၸႂ်", "ႁဵတ်ႉႁိူၼ်း", "ႁဵတ်ႉၵၢၼ်", "ပူႇမွၼ်ႇ", "ပူႇၼၢႆး", "ပူႇထဝ်ႈ", "ပူႇပႃ", "ပူၵရိတ်ႇ", "ပူႇသၽႃႇဝ", "ပူႇသၢမ်"));
    }

    @Test
    public void testText3() {
        printData(Arrays.asList("မၢၵ်ႇၵမ်ႇ", "မၢၵ်ႇၸွၵ်း", "မၢၵ်ႇၶိူဝ်", "မၢၵ်ႇၵႅမ်ႈၶွင်ႇ", "မၢၵ်ႇၵႅမ်ႈ", "မၢၵ်ႇမူင်ႊ", "မၢၵ်ႇမၼ်ႉ", "မၢၵ်ႇမွၼ်ႊ", "မၢၵ်ႇၶူဝ်", "မၢၵ်ႇလၢင်း"));
    }

    @Test
    public void testText4() {
        printData(Arrays.asList("ၸၢႆးမၢဝ်း", "ၸၢႆးၵွၼ်းၶမ်း", "ၸၢႆးၵွၼ်းမၢဝ်း", "ၸၢႆးၵွၼ်းလႅင်း", "ၸၢႆးၵွၼ်ႊလၢဝ်", "ၸၢႆးၵျေႃႇသူၺ်ႇ", "ၸၢႆးၵဵင်းတူင်", "ၸၢႆးၵဵင်းယၢင်း", "ၸၢႆးၵိုင်", "ၸၢႆးၵိူင်ႇ"));
    }

    @Test
    public void testText5() {
        printData(Arrays.asList("ၵၢၼ်ႁဵၼ်း", "ၵၢၼ်ႁဵတ်ႉ", "ၵၢၼ်မိူင်း", "ၵၢၼ်ၵႃႉၶၢႆ", "ၵၢၼ်တေႃႉၶူဝ်း", "ၵၢၼ်ဢွၼ်ႇလႅင်း", "ၵၢၼ်ပရႁိတ", "ၵၢၼ်လီၵုသူဝ်ႇ", "ၵၢၼ်ၸိူဝ်ႉၶိူဝ်း", "ၵၢၼ်လိၵ်ႈလၢႆး"));
    }


}