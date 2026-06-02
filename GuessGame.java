package com.may01;
public class GuessGame
{
	int hiddenNo = 6;
	public int guess(int n)
	{
		if(n == hiddenNo)
		{
			return 0;
		}
		else if(n > hiddenNo)
		{
			return -1;
		}
		else
		{
			return 1;
		}
	}
}
