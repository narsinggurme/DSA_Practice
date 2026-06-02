package com.march;

import java.util.HashSet;
import java.util.Set;

public class ArrayIntersection {

    public static void findIntersection(int[] arr1, int[] arr2)
    {
        Set<Integer> set = new HashSet<>();
        boolean found = false;

        for(int num : arr1)
        {
            set.add(num);
        }

        for(int num: arr2)
        {
            if(set.contains(num))
            {
                System.out.println("Intersection Elements: " + num);
                found = true;
            }
        }
        if(!found)
        {
            System.out.println("No Intersection Elements");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int[] arr2 = {6,7,8,9,4};
        findIntersection(arr, arr2);
    }
}
