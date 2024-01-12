package it.saimao.shan_converter.word_sordings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ShanWordSortingTest {
    @Test
    public void testConsonantSorting() {
        List<String> strings = Arrays.asList("ၵ", "ၵၶ", "တတ", "တၼ", "ၼ", "ပ", "ႁ", "ၶ", "လ");
        strings.sort(new ShanWordSorting());
        strings.forEach(System.out::println);
    }

    @Test
    public void testMedianSorting() {
        List<String> strings = Arrays.asList("ၶျၢင်း","ၶႂၢင်း","ၶွင်ႉ", "ၶြႃႊ", "ၽြႃး", "တြႃး", "သြႃႇ", "ၶျႃး", "ၶျီး");
        printData(strings);
    }

    private void printData(List<String> strings) {
        strings.sort(new ShanWordSorting());
        strings.forEach(System.out::println);
    }

    @Test
    public void testVowelSorting() {
        List<String> strings = Arrays.asList("ၵႃ", "ၵီ", "ၵူ", "ၵိုဝ်", "ၵိူဝ်", "ၵေ", "ၵူဝ်", "ၵႄ", "ၵေႃ");
        strings.sort(new ShanWordSorting());
        strings.forEach(System.out::println);
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

    @Test
    public void testReplaceKaikhin() {
        printData(Arrays.asList("ၵႆ", "ၵၢႆး", "ၶွႆ", "ၶွႆႈ", "ၶႆႇ"));
    }

    @Test
    public void testDevowelizationWithTones() {
//        printData(Arrays.asList("ၶၢတ်", "ၶၢတ်း", "ၶုတ်ႉ", "ၶုၼ်း", "ၶုၵ်ႉ", "ၶူၵ်ႉ", "ၶူၵ်", "ၶိူၵ်"));
        printData(Arrays.asList("ၶၢတ်", "ၶုၵ်း"));
    }

    @Test
    public void testText1() {
        printData(Arrays.asList("ၵႃႇလႃး", "ၵတ်ႉၶႅၼ်ႇ", "ၵျမ်းတေႉ", "ၵျေႃႇတေႉ", "ၵႃးပလိၵ်ႈ", "ၵႃးထႆး"));
    }


}