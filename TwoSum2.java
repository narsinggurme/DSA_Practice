package com.march;

import java.util.HashMap;
import java.util.Map;

public class TwoSum2
{
    public static void main(String[] args)
    {
        int[] arr = {5,4,2,3,1};
        int target = 9;

        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<arr.length; i++)
        {
            int diff = target - arr[i];

            if(map.containsKey(diff))
            {
                System.out.println("Indices Found: " + map.get(diff)+ "," + i);
                System.out.println("Pair Found: " + diff + "," + arr[i]);

                return;
            }
            map.put(arr[i], i);
        }
        System.out.println("Not found");

    }
}
