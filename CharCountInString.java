package com.march;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class CharCountInString
{
    public static void main(String [] arr)
    {
        String str = "Narsing";
        Map<Character, Integer> map = new TreeMap<>();
        for(char c : str.toLowerCase().toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }

        System.out.println(map);
    }
}
