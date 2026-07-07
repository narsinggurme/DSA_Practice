package com.may01;

public class SumAndMultiply 
{
	public static long sumAndMultiply(int n) 
	{
		if(n  == 0)
		{
			return 0;
		}
//		StringBuilder sb = new StringBuilder();
//		int sum = 0;
//		while(n > 0)
//		{
//			int temp = n %10;
//			if(temp != 0)
//			{
//				sb.append(temp);
//				sum += temp;
//			}
//			
//			n/=10;
//		}
//		sb.reverse();
//		
//		return (long) Integer.parseInt(sb.toString()) * sum;
		long x = 0;
		long place = 1;
		int sum = 0;
		while(n > 0)
		{
			int digit = n % 10;
			
			if(digit != 0)
			{
				x = digit * place + x;
				place *= 10;
				sum += digit;
			}
			n/=10;
		}
	return x * sum;
	
	}

	public static void main(String[] args) 
	{
		int n = 102030004;
		System.out.println(sumAndMultiply(n));

	}

}
