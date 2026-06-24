package com.may01;

import java.util.Arrays;

public class RemoveDuplicatesFromArray 
{
	public static int removeDuplicate(int[] nums)
	{
		int n = nums.length;
		if(n <= 2)
		{
			return n;
		}
		
		int count = 2;
		for(int i=2; i<n; i++)
		{
			if(nums[i] != nums[count -2])
			{
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
		
	}
	
	public static void main(String[] args) 
	{
		int[] nums = {1,1,1,2,2,3};
		
		System.out.println(removeDuplicate(nums));

	}

}
