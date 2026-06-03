package com.march;

public class FactorialUsingRecursion
{
    public static int factorial(int n)
    {
        if(n==0 || n==1)
        {
            return 1;
        }
        System.out.println(n);
        return n * factorial(n-1);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println("factorial: " + factorial(n));
    }

}
