package it.saimao.shan_converter.word_sordings;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class ShanWordSortingTest {
    @Test
    public void testConsonantSorting() {
        List<String> strings = Arrays.asList("ၵ", "ၵၶ", "တ", "ၼ", "ပ", "ႁ", "ၶ", "လ");
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
    }

}