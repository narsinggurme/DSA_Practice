package com.may01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams 
{
	public static List<List<String>> groupAnagrams(String[] strs)
	{
		Map<String, List<String>> map = new HashMap<>();
		for(String str: strs)
		{
			char[] ch = str.toCharArray();
			Arrays.sort(ch);
			String key = new String(ch);
			
			map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
		}
		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) 
	{
		String[] str = {"eat","tea","tan","ate","nat","bat"};
		List<List<String>> groupAnagrams = groupAnagrams(str);
		System.out.println(groupAnagrams);
		

	}

}
