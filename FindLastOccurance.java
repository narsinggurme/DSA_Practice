package com.may01;

public class FindLastOccurance 
{
	public static int lastOccurance(int[] arr, int target)
	{
		int left = 0;
		int right = arr.length -1;
		int ans = -1;
		while(left <= right)
		{
			int mid = left + (right -left)/2;
			System.out.println("mid:"+ arr[mid] + " target: "+ target);
			if(arr[mid] == target)
			{
				ans = mid;
				left = mid +1;
			}
			else if(arr[mid] < target)
			{
				left = mid +1;
			}
			else
			{
				right = mid -1;
			}
			
				
		}
		
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,6,8,8,8,8};
		int x = 8;
		System.out.println("Last Occurance: " + lastOccurance(arr, x));
	}

}
