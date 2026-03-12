package com.march;

public class Factorial
{
    public static int factorial(int n)
    {
        int result = 1;
        if(n==0 || n==1)
        {
            return result;
        }

        for(int i=1; i<=n; i++)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial: " + factorial(n));
    }

}
