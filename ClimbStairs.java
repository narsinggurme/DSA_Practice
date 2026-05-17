package com.may01;

public class ClimbStairs
{
	public static int climbStairs(int n)
	{
		int first = 1;
		int second = 2;
		for(int i=3; i<=n; i++)
		{
			int current = first + second;
			first = second;
			second = current;
		}
		return second;
	}

	public static void main(String[] args) 
	{
		int n = 4;
		
		System.out.println(climbStairs(n));
		

	}

}
