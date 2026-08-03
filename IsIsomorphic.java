package com.may01;

import java.util.HashMap;

public class IsIsomorphic 
{
	public static boolean isIspomorphic(String s, String t)
	{
		HashMap<Character, Character> sMap = new HashMap<>();
		HashMap<Character, Character> tMap = new HashMap<>();

		for(int i=0; i <s.length();i++)
		{
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			System.out.println(c1 + " "+ c2);
			
			if(sMap.containsKey(c1))
			{
				if(sMap.get(c1) != c2)
				{
					return false;
				}
			}
			
			if(tMap.containsKey(c2))
			{
				if(tMap.get(c2) != c1)
				{
					return false;
				}
			}
		
			sMap.put(c1, c2);
			tMap.put(c2, c1);
		}
		return true;
	}

	public static void main(String[] args) 
	{
//		System.out.println(isIspomorphic("egg", "add"));
//		System.out.println(isIspomorphic("f11", "b23"));
		System.out.println(isIspomorphic("paper", "title"));
//		System.out.println(isIspomorphic("bbbaaaba", "aaabbbba"));
	}

}
