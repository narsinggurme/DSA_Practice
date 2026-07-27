package com.may01;

import java.util.Arrays;

public class MaxProductOf2
{
	public static int  maxProduct(int [] nums) 
	{
//		Arrays.sort(nums);
//		int n = nums.length;
//		return (nums[n-1] -1) * (nums[n-2] -1);
		
		int max1 = 0;
		int max2 = 0;
		
		for(int num: nums)
		{
			if(num >= max1)
			{
				max2 = max1;
				max1 = num;
			}
			else if(num > max2)
			{
				max2 = num;
			}
		}
		
		return (max1-1) * (max2-1);
	}

  public static void main(String[] args) {

      int arr[] = {1,5,4,5};

      System.out.println("Maximum Product: " + maxProduct(arr));
  }
}