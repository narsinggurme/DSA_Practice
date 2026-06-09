package com.may01;

public class MinCommonValueInArray 
{
	public static int minCommonValueInArray(int[] arr1, int[] arr2)
	{
//		for(int i=0; i<arr1.length; i++)
//		{
//			for(int j=0; j<arr2.length; j++)
//			{
//				if(arr1[i] == arr2[j])
//				{
//					return arr1[i];
//				}
//			}
//		}
//		return -1;
		
		int i = 0;
		int j = 0;
		
		while( i< arr1.length && j<arr2.length)
		{
			System.out.println("arr1[i]: " + arr1[i] + " | arr2[j]: " + arr2[j] );
			if(arr1[i] == arr2[j])
			{
				return arr1[i];
			}
			
			if(arr1[i] < arr2[j])
			{
				i++;
			}
			else
			{
				j++;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		int[] arr1 = {3,4,5};
		int[] arr2 = {1,2,3};
		System.out.println("Common Value: " + minCommonValueInArray(arr1, arr2));
		
	}

}
