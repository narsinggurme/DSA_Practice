package com.march;

public class ReverseString3
{
    public static String reverse(String str)
    {
        char [] arr = str.toCharArray();
        int left = 0;
        int right = str.length()-1;

        while(left < right)
        {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left ++;
            right --;
        }
        return new String(arr);

    }
    public static void main(String[] args) {
        String str = "Narsing";
        String rev = reverse(str);

        System.out.println("Reversed String: " + rev);
    }
}
