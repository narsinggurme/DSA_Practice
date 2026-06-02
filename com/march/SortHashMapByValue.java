package com.march;

import java.util.HashMap;
import java.util.Map;

public class SortHashMapByValue
{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 2);
        map.put("b", 1);
        map.put("c", 3);

        map.entrySet().stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
    }
}
