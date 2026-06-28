package com.may01;

import java.util.Arrays;

public class MaxElementAfterDecrementingAndRearranging 
{
	public static int maxElementAfterDecrementingAndRearranging(int[] arr) 
	{
		Arrays.sort(arr);
		arr[0] = 1;
		for(int i=1; i<arr.length; i++)
		{
			System.out.println("element: "+arr[i]+" | "+arr[i-1]+1);
			arr[i] = Math.min(arr[i], arr[i-1]+1);
		}
		return arr[arr.length -1];
	}

	public static void main(String[] args) 
	{
		int[] arr = {100,1,1000};
		System.out.println(maxElementAfterDecrementingAndRearranging(arr));
	}
}
