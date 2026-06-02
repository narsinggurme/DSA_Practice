package com.may01;

public class MinimumElement
{
	public int minElement(int[] arr)
	{
		int min = Integer.MAX_VALUE;
		
		for(int n: arr)
		{
			int sum = 0;
			
			while(n > 0)
			{
				sum += n % 10;
				n/=10;
			}
			
			min = Math.min(sum, min);
		}
		return min;
	}

	public static void main(String[] args)
	{
		int[] arr = {16,11,12,13,14};
		MinimumElement element = new MinimumElement();
		System.out.println(element.minElement(arr));

	}

}
