package com.may01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent 
{
	public static int[] topKFrequent(int[] arr, int k) 
	{
		int[] result = new int[k];
		Map<Integer, Integer> map = new HashMap<>();
		for(int n: arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
//		list.sort((a,b) -> b.getValue() - a.getValue());
		list.sort((a, b) -> Integer.compare(b.getValue(), a.getValue()));
		
		for(int i=0; i<k; i++)
		{
			result[i] = list.get(i).getKey();
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int[] arr = {4,1,-1,2,-1,2,3};
		int [] arr2 = {5,3,1,1,1,3,5,73,1};
		
		System.out.println(Arrays.toString(topKFrequent(arr, 2))); //-1, 2
		System.out.println(Arrays.toString(topKFrequent(arr2, 3))); //1,3,5

	}

}
