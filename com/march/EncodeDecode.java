package com.march;

public class EncodeDecode
{
    public static int numDecodings(String str)
    {
        if(str.length() == 0 || str.charAt(0) == '0' || str == null)
        {
            return 0;
        }
        int prev2 = 1;
        int prev1 = 1;

        for(int i=1; i<str.length(); i++)
        {
            int current = 0;
            if(str.charAt(0)!= '0')
            {
                current += prev1;
            }

            int twoDigit = Integer.parseInt(str.substring(i-1, i+1));
            System.out.println("twoDigit: " + twoDigit);
            if(twoDigit >= 10 && twoDigit <=26)
            {
                current += prev2;
            }
            prev2 = prev1;
            prev1 = current;
        }
        return prev1;
    }

    public static void main(String[] args) {

        System.out.println("No. of ways to decode: "+ numDecodings("123"));
    }
}
