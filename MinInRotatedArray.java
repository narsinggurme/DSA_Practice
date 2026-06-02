package com.may01;

public class MinInRotatedArray 
{
	public int findMin(int[] nums)
	{
		int left = 0;
		int right = nums.length - 1;
		
		while(left < right)
		{
			int mid = left + (right - left) /2;
			
			if(nums[mid] > nums[right])
			{
				left = mid + 1;
			}
			else
			{
				right = mid;
			}
		}
		
		return nums[left];
	}

	public static void main(String[] args) 
	{
		int[] arr = {3,4,5,0,1,2};
		MinInRotatedArray array = new MinInRotatedArray();
		System.out.println("result: " + array.findMin(arr));

	}

}
