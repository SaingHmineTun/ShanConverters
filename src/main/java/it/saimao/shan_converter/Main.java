package it.saimao.shan_converter;

import it.saimao.shan_converter.breakers.ShanSyllableBreaker;
import it.saimao.shan_converter.converters.ShanTranslit;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] phrases = ShanSyllableBreaker.syllable_break("လိူတ်သိုပ်ႇထိူၵ်ႈၵိုၵ်းၶိုၵ်ႉၵိူတ်ႊ").split("\u0020");
        StringBuilder result = new StringBuilder();
        Arrays.stream(phrases).forEach(s -> {
            result.append(ShanTranslit.taiToEng(s)).append(" ");
        });
        System.out.println(result.toString().trim());
    }
}