package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        String[] words = sentence.split(" ");
        Map<String, Integer> wordRepetitionMap = new HashMap<>();
        for (String word : words) {
            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (word.equalsIgnoreCase(words[j])) {
                    counter++;
                }
            }
            wordRepetitionMap.put(word.toLowerCase(), counter);
        }
        return wordRepetitionMap;
    }
}
