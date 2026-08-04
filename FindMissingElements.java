package com.may01;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindMissingElements 
{
	public static List<Integer> findMissingElements(int[] nums) 
	{
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		Set<Integer> set = new HashSet<>();
		for(int n: nums)
		{
			set.add(n);
			min = Math.min(min, n);
			max = Math.max(max, n);
			
		}
		List<Integer> list = new ArrayList<>();
		for(int i=min+1; i< max;  i++)
		{
			if(!set.contains(i))
			{
				list.add(i);
			}
		}
		
		return list;
	}
	
	public static void main(String[] args) 
	{
		int[] nums = {1,4,2,5};
		System.out.println(findMissingElements(nums));
	}

}
