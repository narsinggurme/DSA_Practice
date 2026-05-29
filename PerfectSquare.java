package com.may01;

public class PerfectSquare
{
	public boolean isSquare(int n)
	{
//		for (long i = 1; i * i <= n; i++)
//		{
//			if (i * i == n) 
//			{
//				return true;
//			}
//		}
//		return false;
		int left = 1;
		int right = n;
		while(left <= right)
		{
			int mid = left +(right -left) / 2;
			long square = (long) mid *mid;
			
			if(square == n)
			{
				return true;
			}
			else if(square > n)
			{
				right = mid - 1;
			}
			else
			{
				left = mid + 1;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int num = 24;
		PerfectSquare square = new PerfectSquare();
		System.out.println(square.isSquare(num));

	}

}
