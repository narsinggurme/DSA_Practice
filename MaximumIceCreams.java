package com.may01;

import java.util.Arrays;

public class MaximumIceCreams 
{
	public static int maxIceCream(int[] costs, int coins)
	{
		Arrays.sort(costs);
		System.out.println(Arrays.toString(costs));
		int maxIceCream = 0;
		int sum = 0;
		for(int cost: costs)
		{
			sum += cost;
			if(sum <= coins)
			{
				System.out.println("SUM: " + sum);
				maxIceCream ++;
			}
			else
			{
				break;
			}
			
		}
		return maxIceCream;
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {7,3,3,6,6,6,10,5,9,2};
		int count = 56;
		
		System.out.println(maxIceCream(arr, count));

	}

}
