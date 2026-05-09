package com.may01;

import java.util.Arrays;

public class Anagram 
{
	public static boolean isAnagram(String str1, String str2 )
	{
		char[] ch = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch);
		Arrays.sort(ch2);
		
		return Arrays.equals(ch, ch2);
	}

	public static void main(String[] args)
	{
		String str = "abc";
		String str2 = "cba";
		System.out.println(isAnagram(str, str2));

	}

}
