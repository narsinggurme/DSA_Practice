package com.may01;

public class BestTimeToBuyAndSellStock 
{
	public static int maxProfit(int[] stocks)
	{
		int minPrice = Integer.MAX_VALUE;
		int maxProfit = 0;
		
		for(int price: stocks)
		{
			if(price < minPrice)
			{
				minPrice = price;
			}
			else
			{
				maxProfit = Math.max(maxProfit, price - minPrice);
			}
		}
		
		return maxProfit;
	}

	public static void main(String[] args) 
	{
		int[] arr  = {7,6,1,4,3,1};
		System.out.println(maxProfit(arr));

	}

}
