package com.may01;

public class MissingNumber2 
{
	public static int missingNumber(int [] arr)
	{
		int n = arr.length;
		int expectedSum = n*(n+1)/2;
		int actualSum =0;
		
		for(int sum : arr)
		{
			actualSum+= sum;
		}
		return expectedSum - actualSum;
	}

	public static void main(String[] args) 
	{
		int[] arr = {1,3,2,4,6,5};
		
		System.out.println(missingNumber(arr));
	}

}
