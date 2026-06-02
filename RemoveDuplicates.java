package com.may01;

public class RemoveDuplicates 
{
	public static int removeDuplicates(int[] arr)
	{
		int n =1;
		
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i] != arr[i-1])
			{
				arr[n] = arr[i];
				n++;
			}
		}
		
		return n;
	}

	public static void main(String[] args) 
	{
		int[] arr = {0,0,1,1,1,2,2,3,3,4};
		
		int k = removeDuplicates(arr);
		System.out.println("k: " + k);
		
		for(int i=0; i<k; i++)
		{
			System.out.print(arr[i] +" ");
		}

	}

}
