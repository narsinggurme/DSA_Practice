package com.march;

public class MoveZeros2
{
    public static void moveZero(int[] arr)
    {
        int index = arr.length-1;
        for(int i=arr.length-1; i>=0; i--)
        {
            if(arr[i] != 0)
            {
                arr[index] = arr[i];
                index --;
            }
        }
        while(index >=0)
        {
            arr[index] = 0;
            index --;
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
