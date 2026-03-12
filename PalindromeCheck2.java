package com.march;

import java.nio.charset.CharsetEncoder;

public class PalindromeCheck2
{
    public static boolean isPalindrome(String str)
    {
        int left = 0;
        int right = str.length()-1;

        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(str.charAt(left)))
            {
                left ++;
            }

            while(left < right && !Character.isLetterOrDigit(str.charAt(right)))
            {
                right --;
            }
            if(str.charAt(left) != str.charAt(right))
            {
                return false;
            }
            left ++;
            right --;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        str = str.toLowerCase();

        if(isPalindrome(str))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}
