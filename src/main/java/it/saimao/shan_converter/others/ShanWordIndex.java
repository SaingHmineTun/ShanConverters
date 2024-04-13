package it.saimao.shan_converter.others;

import it.saimao.shan_converter.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Handler;

public class ShanWordIndex {

    public static void main(String[] args) {
        var map = getShanWordsIndex("တေလႆႈၶိုၼ်ႈမိူဝ်းႁွတ်ႈထိုင်ပၢႆႊၽူၺ်းႁ");
        System.out.println(map);
    }
    public static Map<String, Queue<Integer>> getShanWordsIndex(String input) {
        var map = new HashMap<String, Queue<Integer>>();
        var syl = ShanRuleBasedSyllableSegmentation.segmentAsArray(input);
        for (int i = 0; i < syl.length; i++) {
            if (!map.containsKey(syl[i])) {
                map.put(syl[i], new LinkedList<>());
            }
            map.get(syl[i]).add(i);
        }
        return map;
    }
}
