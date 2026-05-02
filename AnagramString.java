package com.may01;

import java.util.LinkedHashMap;
import java.util.Map;

public class AnagramString
{
    public static void main(String[] args) {
        String str1 = "silent";
        String str2 = "listen";

        if(str1.length()  != str2.length())
        {
            System.out.println("not anagram");
            return;
        }
        Map<Character, Integer> map1 = new LinkedHashMap<>();
        Map<Character, Integer> map2 = new LinkedHashMap<>();

        for(char c : str1.toCharArray())
        {
            map1.put(c , map1.getOrDefault(c,0)+1);
        }

        for(char c : str2.toCharArray())
        {
            map2.put(c, map2.getOrDefault(c, 0)+1);
        }

        if(map1.equals(map2))
        {
            System.out.println("Anagram");
        }
        else
        {
            System.out.println("Not anagram");
        }
    }
}
