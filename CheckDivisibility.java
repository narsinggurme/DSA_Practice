package com.may01;

public class CheckDivisibility 
{
	public static boolean checkDivisibility(int n) 
	{
		int original = n;
		int multply = 1;
		int sum =0;
		
		while(n > 0)
		{
			int digit = n%10;
			multply *= digit;
			sum += digit;
			n/=10;
		}
		
		return original %(sum + multply) == 0;
	}

	public static void main(String[] args) 
	{
		System.out.println("Result: " + checkDivisibility(99));
		System.out.println("Result: " + checkDivisibility(20));
	}

}
