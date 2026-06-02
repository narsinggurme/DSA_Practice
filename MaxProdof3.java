package com.may01;

import java.util.Arrays;

public class MaxProdof3 
{
	public static int MaxProduct(int[] nums)
	{
		Arrays.sort(nums);
		int n = nums.length;
		
		int prod1 = nums[n-1] * nums[n-2] * nums[n-3];
		int prod2 = nums[0]  * nums[1] * nums[n-1];
		System.out.println("Prod1: " + prod1 + " | prod2: "+ prod2);
		return Math.max(prod1, prod2);
	}

	public static void main(String[] args)
	{
		int nums[] = {1,2,3,-4};
		
		System.out.println(MaxProduct(nums));

	}

}
