package com.may01;

public class SearchInsertPosition 
{
	public static int searchInsert(int[] nums, int target)
	{
		int result =0;
		for(int i=0; i<nums.length; i++)
		{
			if(nums[i] < target)
			{
				result++;
			}
		}
		return result;
		
	}
	public static void main(String[] args) 
	{
		int [] nums = {1,2,4,5,6};
		int target = 3;
		
		int searchInsert = searchInsert(nums, target);
		System.out.println("Insert index: " + searchInsert);
		
		
	}
	

}
