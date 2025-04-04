package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        for (Map.Entry<Integer, String> entry : sourceMap.entrySet()) {
            Integer value = entry.getKey();
            String key = entry.getValue();
            if (!result.containsKey(key)) {
                result.put(key, value);
            } else {
                int min = Math.min(value, result.get(key));
                result.put(key, min);
            }
        }
        return result;
    }
}
