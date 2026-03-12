package com.march;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OccurrenceCountInString {

    public static Map<String, Integer> countOccurrence(String[] arr)
    {

        Map<String,Integer> map = new TreeMap<>(); //this is for sorting
      //Map<String,Integer> map = new HashMap<>(); //No insertion order
        // Map<String,Integer> map = new LinkedHashMap<>(); /THis is for insertion Order

        for (String ar : arr)
        {
            ar = ar.trim().toLowerCase();
            map.put(ar,map.getOrDefault(ar,0)+ 1);
        }
        return  map;
    }

    public static void main(String[] args)
    {
        String[] arr = {"Ram ","Bharat", "Ram","Narsing","ram" };
        Map<String, Integer> map= countOccurrence(arr);
        System.out.println(map);
    }
}
