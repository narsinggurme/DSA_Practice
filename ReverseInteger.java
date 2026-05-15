package com.may01;

public class ReverseInteger
{
	public static int reverse(int num)
	{
		int result = 0;
		while(num != 0)
		{
			int temp = num % 10;

			if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && temp > 7)) 
			{
				return 0;
			}
		
			if(result < Integer.MIN_VALUE / 10 || (result == Integer.MIN_VALUE /10 && temp < -8))
			{
				return 0;
			}
			result = result * 10 + temp;

			num /= 10;
		}
		
		return result;	
	}

	public static void main(String[] args) 
	{
		System.out.println(reverse(123));     // 321
		System.out.println(reverse(-123));    // -321
		System.out.println(reverse(120));     // 21
		System.out.println(reverse(1534236469)); // 0 (overflow)

	}

}
