package com.may01;

public class SmallestNumber 
{
	public static int smallestNumber(int n , int t) 
	{
		while(true)
		{
			if(isDivisible(n, t))
			{
				return n;
			}
			
			n++;
		}
	}
	
	public static boolean isDivisible(int n, int t)
	{
		int prod = 1;
		while(n > 0)
		{
			int temp = n % 10;
			prod *= temp;
			n/=10;
		}
		
		return prod % t ==0;
	}
	
	public static void main(String[] args) 
	{
		
		System.out.println(smallestNumber(10, 2));
		System.out.println(smallestNumber(16, 3));
		
	}

}
