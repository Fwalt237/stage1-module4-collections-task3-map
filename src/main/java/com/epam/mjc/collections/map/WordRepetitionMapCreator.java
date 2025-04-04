package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return new HashMap<>();
        }
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            String cleanWord = word.toLowerCase().replaceAll("[^a-z]", "");
            if(!wordRepetitionMap.containsKey(cleanWord)) {
                int counter = 0;
                for (String s : words) {
                    s=s.toLowerCase().replaceAll("[^a-z]", "");
                    if (cleanWord.equalsIgnoreCase(s)) {
                        counter++;
                    }
                }
                wordRepetitionMap.putIfAbsent(cleanWord, counter);
            }
        }
        return wordRepetitionMap;
    }
}
