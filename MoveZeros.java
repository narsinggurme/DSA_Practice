package com.may01;

import java.util.Arrays;

public class MoveZeros 
{
	public static void moveZeros(int[] arr)
	{
		int index = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				arr[index] =  arr[i];
				index++;
			}
		}
		
		while(index<arr.length)
		{
			arr[index] =0;
			index++;
		}
		
	}

	public static void main(String[] args) 
	{
		int[] arr =  {1,2,0,3,0,4};

		moveZeros(arr);
		System.out.println(Arrays.toString(arr));

	}

}
