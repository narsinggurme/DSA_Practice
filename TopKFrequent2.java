package com.may01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent2 
{
	public static List<String> topKFrequent(String[] words, int k) 
    {
		HashMap<String, Integer> map = new HashMap<>();
		
		for(String word: words)
		{
			map.put(word, map.getOrDefault(word, 0)+ 1);
		}
		
		List<Map.Entry<String, Integer>> list = new ArrayList<>(map.entrySet());
		System.out.println(list);
		list.sort((a, b) -> {
		    if (!a.getValue().equals(b.getValue())) {
		        return b.getValue() - a.getValue();  
		    }
		    return a.getKey().compareTo(b.getKey());  
		});
		List<String> result = new ArrayList<>();

		for(int i=0; i<k; i++)
		{
			result.add(list.get(i).getKey());
		}
		
		
		return result;
		
    }
	
	public static void main(String[] args) 
	{
		String[] words = {"i","love","leetcode","i","love","coding"};
		int k = 2;
		System.out.println(topKFrequent(words, k));
	}

}
