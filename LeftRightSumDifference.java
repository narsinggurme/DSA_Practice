package com.may01;

import java.util.Arrays;

public class LeftRightSumDifference 
{
	public static int[] leftRightDiff(int[] nums)
	{
		int n = nums.length;
		int[] ans = new int[n];
		int totalSum = 0;
		for(int num : nums)
		{
			totalSum += num;
		}
		
		int leftSum = 0;
		for(int i=0; i<n; i++)
		{
			int rightSum = totalSum - leftSum - nums[i];
			ans[i] = Math.abs(leftSum -  rightSum);
			leftSum += nums[i];
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = {10,4,8,3};

		System.out.println(Arrays.toString(leftRightDiff(arr)));
	}

}
