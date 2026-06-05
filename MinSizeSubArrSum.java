package com.may01;

public class MinSizeSubArrSum 
{
	public static int minSubArrayLen(int target, int[] arr)
	{
		int left =0;
		int sum =0;
		int len = Integer.MAX_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			sum += arr[i];
			while(sum >= target)
			{
				len = Math.min(len, i-left + 1);
				sum -= arr[left];
				left ++;
			}
		}
		
		return len == Integer.MAX_VALUE ? 0 :len;
		
	}

	public static void main(String[] args) 
	{
		int target = 7;
		int[] arr = {2,3,1,2,4,3};
		
		System.out.println("result: " + minSubArrayLen(target, arr));

	}

}
