package com.may01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDisappearedNumbers 
{
	public static List<Integer> findNumbers(int[] nums)
	{
		Map<Integer, Integer> map = new HashMap<>();
		List<Integer> result = new ArrayList<>();
		Arrays.sort(nums);
		for(int n: nums)
		{
			if(!map.containsKey(n))
			{
				map.put(n, 1);
			}
		}

		for(int i=1; i <= nums.length; i++)
		{
			
			if(!map.containsKey(i))
			{
				result.add(i);
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int[] nums = {1,1};
		System.out.println(findNumbers(nums));

	}

}
