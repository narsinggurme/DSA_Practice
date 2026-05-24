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
			System.out.println("Mid: " + mid);
			
			if(nums[mid] > nums[right])
			{
				left = mid + 1;
				System.out.println("Left: " + left);
			}
			else
			{
				right = mid;
				System.out.println("right: " + right);

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
