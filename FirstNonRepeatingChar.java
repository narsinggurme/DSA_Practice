package com.march;

public class FirstNonRepeatingChar
{
    public static void main(String[] args) {
        String str = "Narsing";
        str = str.toLowerCase();

        int[] freq = new int[256];

        for(int c: str.toCharArray())
        {
            freq[c]++;
        }

        for(char c: str.toCharArray())
        {
            if(freq[c] == 1)
            {
                System.out.println("First not repeating: " + c);
                return;
            }
        }
        System.out.println("No non-repeating character found");

    }
}
