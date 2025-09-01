package it.saimao.shan_language_tools.others;

import it.saimao.shan_language_tools.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public class ShanWordIndex {
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
