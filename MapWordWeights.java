package com.may01;

public class MapWordWeights 
{
	public static String mapWordWeights(String[] words, int[]weights) 
	{
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<words.length; i++)
		{
			int sum = 0;
			char[] chars = words[i].toCharArray();
			for(char ch: chars)
			{
				int index = ch - 'a';
				sum += weights[index];
			}
			int mod = sum %26;
			
			char mapped = (char) ('z' - mod);
			
			sb.append(mapped);
			
		}
		
		
		return sb.toString();
	}

	public static void main(String[] args) 
	{
		String[] words = {"abcd","def","xyz"};
		int[] weights = {5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
		System.out.println(mapWordWeights(words, weights));

	}

}
