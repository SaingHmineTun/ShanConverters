package it.saimao.shan_converter.word_sordings;

import java.text.Collator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Locale;

public class MyanmarSortingIBM {
    public static void main(String[] args) {
//        var myanmarWordList = Arrays.asList(
//                "ရှမ်း", "ချင်း", "မွန်", "ကယား", "ကရင်", "ရခိုင်", "ကချင်", "ဗမာ"
//        );
        var myanmarWordList = Arrays.asList(
                "ကုန်တင်ကား",
                "ချည်နှောင်",
                "ကပွဲ",
                "ခြိမ့်ခြိမ့်",
                "ကစားပွဲ",
                "ကိုကင်း",
                "ကိုယ်ရံတော်",
                "ကူးသန်း",
                "ဂင်္ဂါး",
                "ကီလိုမီတာ",
                "ခမ်းဟွမ်",
                "ခမ်းခင်",
                "ခမ်းဟန်"
        );
        Locale myanmar = new Locale("my", "MM", "");
//        Collator coll = Collator.getInstance(myanmar);
        myanmarWordList.sort(new MyanmarWordSorting());
        myanmarWordList.forEach(System.out::println);
    }
}
