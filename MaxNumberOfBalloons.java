package com.may01;

public class MaxNumberOfBalloons 
{
	public static int maxNumberOfBalloons(String text)
	{
		int[] freq = new int[26];

		for (char c : text.toCharArray()) 
		{
			freq[c - 'a']++;
		}

		int result = Integer.MAX_VALUE;
		result = Math.min(result, freq['b' - 'a']);     
		result = Math.min(result, freq['a' - 'a']);    
		result = Math.min(result, freq['l' - 'a'] / 2); 
		result = Math.min(result, freq['o' - 'a'] / 2); 
		result = Math.min(result, freq['n' - 'a']);     

		return result;
	}

	public static void main(String[] args) 
	{
		String text = "loonbalxballpoon";
		System.out.println(maxNumberOfBalloons(text));
	}

}
