package com.may01;

import java.util.HashSet;

public class LongestCommonPrefix
{
    public int longestCommonPrefix(int[] arr1, int[] arr2)
    {
        HashSet<Integer> set = new HashSet<>();

        for(int n : arr1)
        {
            while(n > 0)
            {
                set.add(n);
                n /= 10;
            }
        }

        int res = 0;

        for(int n : arr2)
        {
            while(n > 0)
            {
                if(set.contains(n))
                {
                    res = Math.max(res, getDigit(n));
                    break;
                }

                n /= 10;
            }
        }

        return res;
    }

    private int getDigit(int n)
    {
        int digit = 0;

        while(n > 0)
        {
            n /= 10;
            digit++;
        }

        return digit;
    }

    public static void main(String[] args)
    {
        int[] arr1 = {1,10,100};
        int[] arr2 = {1000};

        LongestCommonPrefix obj = new LongestCommonPrefix();

        System.out.println(obj.longestCommonPrefix(arr1, arr2));
    }
}