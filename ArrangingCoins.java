package com.may01;

public class ArrangingCoins
{
	public int arrangeCoins(int n)
	{
		long left = 1;
		long right = n;
		
		while(left <= right)
		{
			long mid = left + (right -left)/2;
			System.out.println("left: " + left +" | "+ "right: "+ right);
			System.out.println("mid: " + mid);
			long coinUsed = mid * (mid + 1)/2;
			System.out.println("CoinsUsed: " + coinUsed);
			if(coinUsed == n)
			{
				return (int) mid;
			}
			else if(coinUsed < n)
			{
				left = mid + 1;	
			}
			else
			{
				right = mid - 1;
			}
			
		}
		return (int) right;
	}
	
	public static void main(String[] args) 
	{
		int n = 5;
		ArrangingCoins coins = new ArrangingCoins();
		System.out.println("completed rows: " + coins.arrangeCoins(n));

	}

}
