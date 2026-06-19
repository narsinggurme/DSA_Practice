package com.may01;

public class LargestAltitude 
{
	public static int largestAltitude(int[] gain)
	{
		int result = 0;
		int ans = 0;
		for(int n: gain)
		{
			result += n;
			ans = Math.max(result, ans);
		}
		
		return ans;
	}
	
	public static void main(String[] args) 
	{
		int[] gain = {-4,-3,-2,-1,4,3,2};
		
		System.out.println(largestAltitude(gain));

	}

}
