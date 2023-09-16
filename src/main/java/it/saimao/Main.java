package it.saimao;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

import static it.saimao.ShanSyllableBreaker.syllable_break;
import static it.saimao.TaiglishConverter.taiToEng;

public class Main {
    public static void main(String[] args) {
        String[] phrases = syllable_break("လိူတ်သိုပ်ႇထိူၵ်ႈၵိုၵ်းၶိုၵ်ႉၵိူတ်ႊ").split("\u0020");
        StringBuilder result = new StringBuilder();
        Arrays.stream(phrases).forEach(s -> {
            result.append(taiToEng(s)).append(" ");
        });
        System.out.println(result.toString().trim());
    }
}