package com.march;

public class FindSecondSmallest
{
    public static int secondSmallest(int [] arr)
    {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] < smallest)
            {
                secondSmallest = smallest;
                smallest = arr[i];
            }
            else if (arr[i] < secondSmallest && arr[i] != smallest)
            {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static void main(String[] args)
    {
        int [] arr = {1,1,2,4,19,18};
        int result = secondSmallest(arr);
        System.out.println("Second Largest: " + result);
    }
}
