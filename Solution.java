package com.may01;

class Solution extends GuessGame
{
	public int guessNumber(int n)
	{
		int left = 1;
		int right = n;
		
		while (left <= right)
		{
			int mid = left + (right - left)/2;
			int res = guess(mid);
			System.out.println("result: " + res);
			if(res == 0)
			{
				return mid;
			}
			else if(res == -1)
			{
				right = mid - 1;
			}
			else
			{
				left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) 
	{
		Solution solution = new Solution();
		System.out.println("Picked No. is: " + solution.guessNumber(77));
		
	}
}
