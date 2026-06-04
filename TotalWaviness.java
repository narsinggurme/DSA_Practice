package com.may01;

public class TotalWaviness
{
	public static int totalWaviness(int num1, int num2)
	{
		int start =Math.max(100, num1);
		int total =0;
		for(int i=start; i<= num2; i++)
		{
			total+= waviness(i);
		}
		return total;
	}
	
	private static int waviness(int n)
	{
		String s = String.valueOf(n);
		int count =0;
		
		for(int i= 1; i< s.length()-1; i++)
		{
			int left = s.charAt(i - 1) - '0';
			int current = s.charAt(i) - '0';
			int right = s.charAt(i+1) - '0';
			
			System.out.println("left = " + left +
	                   ", current = " + current +
	                   ", right = " + right);
			//peak
			if((current > left && current > right) || (current < left && current < right))
			{
				System.out.println("current: " + current);
				count ++;
			}
		}
		
		return count;
	}

	public static void main(String[] args) 
	{
		int num1 = 120;
		int num2 = 130;
		
		System.out.println("Waving:" + totalWaviness(num1,num2));

	}

}
