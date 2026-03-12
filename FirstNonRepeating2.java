package com.march;

import java.util.*;


public class FirstNonRepeating2 {
    public static void main(String[] args)
    {
        String str = "abca";
        str = str.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                System.out.println("found: " + entry.getKey());
                return;
            }
        }
        System.out.println("Not found any non repeating character");

    }
}
