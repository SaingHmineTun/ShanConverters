package it.saimao.shan_converter.others;

import it.saimao.shan_converter.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.HashMap;
import java.util.Map;

public class ShanWordFrequencyCounter {
//    public static void main(String[] args) {
//        String word = "တေလႆႈၶိုၼ်ႈမိူဝ်းႁွတ်ႈထိုင်တေမိူဝ်ႈလႂ်";
//        Map<String, Integer> map = countShanWords(word);
//        for (Map.Entry<String, Integer> entry : map.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }
//    }
    public static Map<String, Integer> countShanWords(String word) {
        Map<String, Integer> map = new HashMap<>();
        String[] sylbreak = ShanRuleBasedSyllableSegmentation.segmentAsArray(word);
        for (String singleWord : sylbreak) {
            map.merge(singleWord, 1, Integer::sum);
        }
        return map;
    }
}
