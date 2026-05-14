package com.may01;

import java.util.HashMap;

public class SingleNumber 
{
	public static int singleNumber(int[] arr)
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int num: arr)
		{
			map.put(num, map.getOrDefault(num, 0)+1);
		}
		
		for(int num : map.keySet())
		{
			if(map.get(num) ==1)
			{
				return num;
			}
		}
		
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {0,1,0,1,0,1,99};
		System.out.println(singleNumber(arr));

	}

}
