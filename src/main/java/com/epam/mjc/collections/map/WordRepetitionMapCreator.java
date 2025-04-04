package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split("\\s+");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            if(!wordRepetitionMap.containsKey(word.toLowerCase())) {
                int counter = 0;
                for (String s : words) {
                    if (word.equalsIgnoreCase(s)) {
                        counter++;
                    }
                }
                wordRepetitionMap.putIfAbsent(word.toLowerCase(), counter);
            }
        }
        return wordRepetitionMap;
    }
}
