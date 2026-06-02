package com.may01;

public class FindDuplicate 
{
	public int findDuplicate(int[] arr)
	{
		int left = 1;
		int right = arr.length - 1;
		
		while(left < right)
		{
			System.out.println("right:" + right);
			int mid = left + (right - left ) /2;
			System.out.println("mid: " + mid);
			int count = 0;
			for(int n : arr)
			{
				if(n <= mid)
				{
					count ++;
				}
			}
			System.out.println("Count: " + count);
			if(count > mid)
			{
				right = mid;
			}
			else
			{
				left = mid + 1;
			}
		}
		return left;
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,3,4,2,2};
		FindDuplicate duplicate = new FindDuplicate();
		System.out.println("Duplicate: " + duplicate.findDuplicate(arr));
	}
}
