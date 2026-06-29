package com.may01;

public class NumOfStrings 
{
	public static int noOfStrings(String[] str, String word)
	{
		int count =0;
		
		for(String w: str)
		{
			if(word.contains(w))
			{
				count++;
			}
			
		}
		
		
		return count;
	}

	public static void main(String[] args) 
	{
		String[] str = {"a","b","c"};
		
		System.out.println(noOfStrings(str, "aaaaabbbbb"));
		

	}

}
