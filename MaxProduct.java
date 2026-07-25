package com.may01;

public class MaxProduct 
{
	public static int  maxProduct(int n) 
	{
		int maxProd1 = 0;
		int maxProd2 = 0;
		
		while (n > 0 )
		{
			int current = n%10;
			n/=10;
			if(current >= maxProd1)
			{
				maxProd2 = maxProd1;
				maxProd1 = current;
			}
			else if(current > maxProd2)
			{
				maxProd2 = current;
			}
		}
		
		return maxProd1 * maxProd2;
	}

	public static void main(String[] args) 
	{
		System.out.println(maxProduct(724));
	}

}
