package com.may01;

public class FindOccurance 
{
	public static int firstOccurance(int[] arr, int target)
	{
		int left =0;
		int right = arr.length -1;
		int res = -1;
		while(left <= right)
		{
			int mid = left + (right - left) /2;
			if(arr[mid] == target)
			{
				res = mid;
				right = mid -1;
			}
			else if(arr[mid] > target)
			{
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
		}
		return res;
	}
	public static int lastOccurance(int[] arr, int target)
	{
		int left =0;
		int right = arr.length -1;
		int res = -1;
		while(left <= right)
		{
			int mid = left + (right - left) /2;
			if(arr[mid] == target)
			{
				res = mid;
				left = mid + 1;
			}
			else if(arr[mid] > target)
			{
				right = mid -1;
			}
			else
			{
				left = mid + 1;
			}
		}
		return res;
	}
	public static int findOccurance(int[] arr, int target)
	{
		
		int first = firstOccurance(arr, target);
		if(first == -1)
		{
			return 0;
		}
		
		int last = lastOccurance(arr, target);
		
		System.out.println("First:" + first + " last : "+ last);
		
		return last - first + 1;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,6,8,8,8,8};
		int x = 8;
		System.out.println("Last Occurance: " + findOccurance(arr, x));
	}

}
