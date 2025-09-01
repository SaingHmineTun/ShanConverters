package it.saimao.shan_language_tools.others;

import it.saimao.shan_language_tools.breakers.ShanRuleBasedSyllableSegmentation;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class ShanWordFrequencyCounter {
    public static Map<String, Integer> countShanWords(String word) {
        return Arrays.stream(ShanRuleBasedSyllableSegmentation.segmentAsArray(word))
                .collect(Collectors.groupingBy(
                        s -> s,                       // group by syllable
                        Collectors.summingInt(w -> 1) // count occurrences
                ))
                .entrySet().stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (a, b) -> a,
                        LinkedHashMap::new
                ));
    }
}
