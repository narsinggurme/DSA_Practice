package com.may01;

import java.util.Arrays;

public class MinimumPushes2 
{
    /**
     * Finds the minimum number of key presses required to type the given word
     * by optimally mapping each character to one of the 8 telephone keypad keys.
     *
     * Characters that appear more frequently are assigned to positions requiring
     * fewer key presses. The first 8 most frequent characters require 1 press,
     * the next 8 require 2 presses, and so on.
     *
     * @param word the input string containing lowercase English letters
     * @return the minimum number of key presses required to type the word
     */
    public static int minimumPushes(String word)
    {
        int[] freq = new int[26];

        // Count the frequency of each character
        for (char ch : word.toCharArray()) 
        {
            freq[ch - 'a']++;
        }

        // Sort frequencies so that the most frequent characters
        // can be assigned the lowest push costs
        Arrays.sort(freq);

        int result = 0;

        // Process characters from highest frequency to lowest frequency
        for (int i = 25; i >= 0; i--) 
        {
            if (freq[i] == 0)
                break;

            int pos = 25 - i;
            int cost = (pos / 8) + 1;

            result += freq[i] * cost;
        }

        return result;
    }

    public static void main(String[] args) 
	{
		System.out.println(minimumPushes("aabbccddeeffgghhiiiiii"));
	}
}

