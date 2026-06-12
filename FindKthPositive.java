package com.may01;

public class FindKthPositive 
{
	public static int findKthPositive(int[] arr, int k)
	{
//		int left = 0;
//		int right = arr.length -1;
//		while(left <= right)
//		{
//			int mid = left + (right - left) /2;
//			int missing = arr[mid] - (mid+1);
//			System.out.println("missing: " + missing + "| mid: " + mid);
//			
//			if(missing < k)
//			{
//				left =mid +1;
//			}
//			else
//			{
//				right = mid -1;
//			}
//		}
//		return left + k;
		int j = 0;
		int num = 1;
		while(true)
		{
			if(j <= arr.length && arr[j] == num)
			{
				j++;
			}
			else
			{
				k--;
				if(k==0)
				{
					return num;
				}
			}
			num++;
		}
		
	}

	public static void main(String[] args) 
	{
		int[] arr = {2,3,4,7,11};
		int k = 5;
		
		System.out.println(findKthPositive(arr, k));
		

	}

}
