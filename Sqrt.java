package com.may01;

public class Sqrt 
{
	public int sqrt(int n)
	{
		if(n < 2)
		{
			return n;
		}
		int left =1;
		int right = n;
		int result =0;
		
		while (left <= right)
		{
			int mid = left + (right - left)/2;
			if(mid <= n/mid)
			{
				result = mid;
				left = mid + 1;
			}
			else
			{
				right = mid -1;
			}
		}
		return result;
	}

	public static void main(String[] args) 
	{
		int n = 9;
		Sqrt sqrt = new Sqrt();
		System.out.println("Result: " + sqrt.sqrt(n));
	}

}
