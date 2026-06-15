package com.may01;

public class MaximumCount 
{
	public static int maximumCount(int[] nums) 
	{
		int negative = firstGreterOrEqualToZero(nums);
		int positive = nums.length - firstGreterThanZero(nums);
		
		return Math.max(negative, positive);
		
	}
	private static int firstGreterOrEqualToZero(int nums[])
	{
		int left = 0;
		int right = nums.length -1;
		int ans = nums.length;
		while(left <= right)
		{
			int mid = left + (right - left )/2;
			
			if(nums[mid] >= 0) 
			{
				ans = mid;
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
		}
		
		return ans;
	}
	private static int firstGreterThanZero(int nums[])
	{
		int left = 0;
		int right = nums.length -1;
		int ans = nums.length;
		while(left <= right)
		{
			int mid = left + (right - left )/2;
			
			if(nums[mid] > 0) 
			{
				ans = mid;
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
		}
		
		return ans;
	}
	public static void main(String[] args) 
	{
		int[] arr= {-3,-2,-1,0,0,1,2};
		System.out.println(maximumCount(arr));

	}

}
