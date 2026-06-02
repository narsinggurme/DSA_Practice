package com.march;

public class PrimeNumber
{
    public static boolean isPrime(int n)
    {
        if(n < 1)
        {
            return false;
        }

        for(int i = 2 ; i <Math.sqrt(n); i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }

        return true;
    }
    public static void main(String[] args) {
        int n = 37;
        int num = (int) Math.sqrt(n);
        System.out.println(num);
        if(isPrime(n))
        {
            System.out.println("Prime Number");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
