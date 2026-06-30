package com.may01;

public class NumberOfSubstrings 
{
	public static int numberOfSubString(String word)
	{
		int n = word.length();
		int[] freq = new int[3];
		int left = 0;
		int count =0 ;
		
		for(int i=0; i<n; i++) 
		{
			freq[word.charAt(i) - 'a']++;
			
			while(freq[0] > 0 && freq[1] >0 && freq[2] >0)
			{
				count += n - i;
				freq[word.charAt(left) - 'a']--;
				left++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) 
	{
		String str = "abcabc";
		System.out.println(numberOfSubString(str));
	}
}
