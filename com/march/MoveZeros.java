package com.march;

public class MoveZeros
{
    public static void moveZero(int[] arr)
    {
        int index = 0;

        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]!=0)
            {
                arr[index] = arr[i];
                index++;
            }
        }
        while(index < arr.length)
        {
            arr[index] =0;
            index++;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,0,3,0};

        moveZero(arr);
        for(int num : arr)
        {
            System.out.print(num + " ");
        }
    }
}
