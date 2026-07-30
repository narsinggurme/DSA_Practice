package com.may01;

public class MinimumPushes 
{
	public static int minimumPushes(String word)
	{
		int n = word.length();
		int totalPushes = 0;
		
		for(int i=0; i<n; i++)
		{
			System.out.println("i: "+ i + " "+ i/8);
			int cost = (i/8) + 1;
			totalPushes += cost;
		}
		
		return totalPushes;
	}

	public static void main(String[] args) 
	{
		System.out.println(minimumPushes("xycdefghij"));

	}

}
