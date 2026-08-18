package com.may01;

import java.util.HashSet;
import java.util.Set;

public class LargestInteger 
{
	public static int largestInteger(int[] nums , int k)
	{
		int[] count = new int[51];
		for (int i = 0; i <= nums.length - k; i++) 
		{
			Set<Integer> set = new HashSet<>();
			for(int j=i; j < i+k; j++)
			{
				set.add(nums[j]);
			}
			
			for(int num : set)
			{
				count[num]++;
			}
		}
		int result = -1;
		for(int num =50; num >=0; num--)
		{
			if(count[num]==1)
			{
				return num;
			}
			
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[] nums = {3, 9, 2, 1, 7};
		System.out.println("Largest Integer: "+largestInteger(nums, 3));
		
		int[] nums2 = {3,9,7,2,1,7};
		System.out.println("Largest Integer: "+largestInteger(nums2, 4));
		
		int[] nums3 = {0,0};
		System.out.println("Largest Integer: "+largestInteger(nums3, 2));


	}

}
