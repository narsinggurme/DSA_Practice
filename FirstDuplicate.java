package com.march;

import java.util.HashSet;
import java.util.Set;

public class FirstDuplicate
{
    public static void findFirstDuplicate(int[] arr)
    {
        Set<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            if(!set.add(num))
            {
                System.out.println("First Duplicate: " + num);
                return;
            }
        }
        System.out.println("No duplicate found");
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,5,6};
        findFirstDuplicate(arr);
    }
}
