package com.may01;

public class MaxTotalSubarray 
{
	public static long maxTotalSubarray(int[] nums, int k)
	{
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
		
		for(int n: nums)
		{
			min = Math.min(min, n);
			
			max = Math.max(max, n);
			System.out.println("Max:"+ max + " | Min: "+ min + " |n: "+ n);
		}
		
		return (max-min) * k;
	}

	public static void main(String[] args)
	{
		int[] arr = {4,2,5,1};
		int k = 3;
		System.out.println(maxTotalSubarray(arr, k));
	}

}
