package com.may01;

public class CountPrimes 
{
	public static int countPrimes(int n) 
	{
		int result = 0;

	    for (int i = 2; i < n; i++)
	    {
	        if (isPrime(i))
	        {
	            result++;
	        }
	    }

	    return result;
	}
	
	public static boolean isPrime(int n)
	{
		if (n <= 1) {
	        return false;
	    }

	    for (int i = 2; i * i <= n; i++)
	    {
	        if (n % i == 0)
	        {
	            return false;
	        }
	    }

	    return true;
	}

	public static void main(String[] args) 
	{
		System.out.println("Count: " + countPrimes(10));
		System.out.println("Count: " + countPrimes(10000));
		System.out.println("Count: " + countPrimes(1));
		System.out.println("Count: " + countPrimes(2));

	}

}
