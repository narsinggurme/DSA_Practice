package com.may01;

import java.util.HashSet;

public class LongestCommonPrefix2 
{
	public static int longestCommonPrefix(int[] arr1, int[] arr2)
	{
		HashSet<String> set = new HashSet<>();
		for(int n : arr1)
		{
			String s = String.valueOf(n);
			for(int i=1;  i<=s.length(); i++)
			{
				set.add(s.substring(0,i));
			}
		}
		int longestPrefix = 0;
		for(int num : arr2)
		{
			String s = String.valueOf(num);
			for(int i=1; i<=s.length(); i++)
			{
				String prefix = s.substring(0,i);
				if(set.contains(prefix))
				{
					longestPrefix = Math.max(longestPrefix, i);
				}
			}
		}
		System.out.println("size:" + set.size());
		return longestPrefix;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,10,100};
		int[] arr2 = {1000};
		
		System.out.println(longestCommonPrefix(arr, arr2));

	}

}
