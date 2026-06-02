package com.may01;

public class PeakElement 
{
	public static int peakElement(int[] nums)
	{
		int left = 0;
		int right = nums.length -1;
		while(left < right)
		{
			int mid = left + (right -left ) /2;
			System.out.println("Mid: " + mid);
			
			if(nums[mid] < nums[mid+1] )
			{
				left = mid + 1;
			}
			else
			{
				right = mid;
			}
		}
		return left;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,1,3,5,6,4};
		
		System.out.println("peak element: " + peakElement(arr));

	}

}
