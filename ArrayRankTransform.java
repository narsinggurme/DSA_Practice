package com.may01;

import java.util.Arrays;
import java.util.HashMap;

public class ArrayRankTransform 
{
	public static int[] arrayRankTransform(int[] arr) 
	{
		int[] copy = arr.clone();
		Arrays.sort(arr);
		int rank = 1;
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i : arr)
		{
			if(!map.containsKey(i))
			{
				map.put(i, rank);
				rank++;
			}
		}

		for(int i=0; i<copy.length; i++)
		{
			copy[i] = map.get(copy[i]);
			
		}
		return copy;
	}

	public static void main(String[] args) 
	{
		int arr[] = {37,12,28,9,100,56,80,5,12};
		
		System.out.println(Arrays.toString(arrayRankTransform(arr)));
	

	}

}
