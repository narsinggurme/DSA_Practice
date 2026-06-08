package com.may01;

import java.util.Arrays;

public class PartitionArrayAccoringToPivot 
{
	public static int[] partitionArrayAccPivot(int[]arr, int pivot)
	{
		int n= arr.length;
		int[] ans = new int[n];
		int idx = 0;
		for(int num: arr)
		{
			if(num < pivot)
			{
				ans[idx++] = num;
			}
		}
		for(int num: arr)
		{
			if(num == pivot)
			{
				ans[idx++] = num;
			}
		}
		for(int num: arr)
		{
			if(num > pivot)
			{
				ans[idx++] = num;
			}
		}
		return ans;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,2,10,3,12,14};
		int pivot = 10;
		
		System.out.println(Arrays.toString(partitionArrayAccPivot(arr, pivot)));

	}

}
