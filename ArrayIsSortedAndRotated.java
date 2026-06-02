package com.may01;

public class ArrayIsSortedAndRotated
{
	public boolean check(int[] arr)
	{
		int count =0;
		int n = arr.length;
		for(int i=0; i< n; i++)
		{
			System.out.println("arr[i]: "+ arr[i] + " > "+ arr[(i+1)%n]);
			if(arr[i] > arr[(1+i)%n])
			{
				count ++;
			}
		}
		return count <=1;
	}

	public static void main(String[] args) 
	{
		ArrayIsSortedAndRotated rotated = new ArrayIsSortedAndRotated();
		int[] arr = {2,1,3,4};
		System.out.println("Result: "+ rotated.check(arr));
		

	}

}
