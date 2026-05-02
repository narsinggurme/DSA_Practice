package com.may01;
import java.util.LinkedHashMap;
import java.util.Map;
public class CharacterCount
{
    public static void main(String[] args)
    {
        String str = "Narsing";
        str = str.toLowerCase();

        Map<Character, Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray())
        {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

    }
}
