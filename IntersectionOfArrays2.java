package com.may01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class IntersectionOfArrays2
{
	public int[] intersect(int[] nums1, int[] nums2)
	{
		HashMap<Integer, Integer> map = new HashMap<>();
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int n: nums1)
		{
			map.put(n, map.getOrDefault(n,0)+1);
		}
		
		for(int n: nums2)
		{
			if(map.getOrDefault(n, 0) >0)
			{
				result.add(n);
				map.put(n, map.get(n) -1);
			}
		}
		
		int[] ans = new int[result.size()];
		for(int i=0;i<ans.length; i++)
		{
			ans[i] = result.get(i);
		}
		
		return ans;
	}
	

	public static void main(String[] args) 
	{
		int[] nums1 = {4,9,5};
		int[] nums2 = {9,4,9,8,4};
		IntersectionOfArrays2 arrays2 = new IntersectionOfArrays2();
		System.out.println(Arrays.toString(arrays2.intersect(nums1, nums2)));

	}

}
