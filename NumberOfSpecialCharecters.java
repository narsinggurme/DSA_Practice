package com.may01;
/*
 * In this problem, special characters are the letters that appear
 * in both lowercase and uppercase forms.
 */
public class NumberOfSpecialCharecters
{
	public static int specialCharecters(String word)
	{
//		Set<Character> upper = new HashSet<>();
//		Set<Character> lower = new HashSet<>();
//		
//		for(char ch : word.toCharArray())
//		{
//			if(Character.isLowerCase(ch))
//			{
//				lower.add(ch);
//			}
//			else
//			{
//				upper.add(ch);
//			}
//		}
//		int count = 0;
//		
//		for(char ch: lower)
//		{
//			char upperChar = Character.toUpperCase(ch);
//			
//			if(upper.contains(upperChar))
//			{
//				count++;
//			}
//		}
//		return count;
		
		boolean[] upper = new boolean[26];
		boolean[] lower = new boolean[26];
		
		for(char ch: word.toCharArray())
		{
			if(Character.isLowerCase(ch))
			{
				lower[ch - 'a'] = true;
			}
			else
			{
				upper[ch - 'A'] = true;
			}
		}
		int count =0;
		
		for(int i=0; i<26; i++)
		{
			if(lower[i] && upper[i])
			{
				count++;
			}
		}
		return count;
	}

	public static void main(String[] args) 
	{
		String word = "aaAbcBC";
		System.out.println(specialCharecters(word));
	}

}
