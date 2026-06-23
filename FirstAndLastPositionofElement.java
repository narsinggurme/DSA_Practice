package com.may01;

import java.util.Arrays;

public class FirstAndLastPositionofElement 
{
	public static int[] searchRange(int[] nums, int target)
	{
		int[] res = new int[2];
		
		res[0] = firstIndex(nums, target);
		res[1] = LastIndex(nums, target);
		
		return res;
	}
	
	public static int  firstIndex(int[] nums,  int target)
	{
		int left = 0;
		int right = nums.length -1;
		int first = -1;
		while(left <= right)
		{
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target)
			{
				first = mid;
				right = mid - 1;
			}
			else if(nums[mid] > target)
			{
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
			
		}
		
		return first;
	}
	public static int  LastIndex(int[] nums,  int target)
	{
		int left = 0;
		int right = nums.length -1;
		int first = -1;
		while(left <= right)
		{
			int mid = left + (right - left) / 2;
			
			if(nums[mid] == target)
			{
				first = mid;
				left = mid + 1;
			}
			else if(nums[mid] > target)
			{
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
			
		}
		
		return first;
	}

	public static void main(String[] args) 
	{
		int [] nums = {5,7,7,8,8,10};
		int target = 6;
		
		System.out.println(firstIndex(nums, target));
		System.out.println(LastIndex(nums, target));

		
		System.out.println(Arrays.toString(searchRange(nums, target)));

	}

}
