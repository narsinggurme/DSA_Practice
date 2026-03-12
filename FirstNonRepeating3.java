package com.march;

import java.util.LinkedHashMap;
import java.util.Map;


public class FirstNonRepeating3
{
    public static char firstUnique(String str)
    {
        Map<Character, Integer> map = new LinkedHashMap<>();
        for(char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        for(Map.Entry<Character, Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }

        return '-';
    }
    public static void main(String[] args)
    {
        String str = "aAn";
        str = str.toLowerCase();
        System.out.println("Non repeating character : " + firstUnique(str));

    }
}
