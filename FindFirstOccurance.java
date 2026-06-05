package com.may01;

public class FindFirstOccurance 
{
	public static int firstOccurance(int[] arr, int target)
	{
		int left =0;
		int right = arr.length -1;
		int ans = -1;
		while(left <= right)
		{
			int mid = left + (right -left )/2;
			System.out.println("mid: " + mid);
			if(arr[mid] == target)
			{
				ans = mid;
				right = mid -1;
			}
			else if(arr[mid] > target)
			{
				right = mid -1;
			}
			else
			{
				left = mid +1;
			}
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,2,3,4,4,4,6,7,7,7,7,7};
		int x = 6;
		System.out.println("First Occurance: " + firstOccurance(arr, x));

	}

}
