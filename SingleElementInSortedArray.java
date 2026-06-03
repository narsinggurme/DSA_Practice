package com.may01;

import java.util.HashMap;
public class SingleElementInSortedArray 
{
	public static int singleNonDuplicate(int[] arr)
	{
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for(int n : arr)
//		{
//			map.put(n, map.getOrDefault(n, 0)+1);
//		}
//		
//		for(int key : map.keySet())
//		{
//			if(map.get(key)==1)
//			{
//				return key;
//			}
//		}
//		return -1;
		
		int result = 0;
		for(int num : arr)
		{
			result^= num;
		}
		return result;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,1,2,3,3,4,4,8,8};
		System.out.println("Single Element: " + singleNonDuplicate(arr));

	}

}
