package com.march;

import java.util.HashMap;
import java.util.Map;

public class TwoSum
{
    public static void main(String[] args)
    {
        int [] nums = {1,2,3,4,5,6};
        int target = 4;
        Map<Integer,Integer> map = new HashMap<>();

       for(int i=0; i<nums.length; i++)
       {
           int diff = target - nums[i];

           if(map.containsKey(diff))
           {
               System.out.println("pair found: " + diff +","+ nums[i]);
               return;

           }
           map.put(nums[i],i);
       }

    }
}
