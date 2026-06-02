package com.may01;

public class FindTheDifference 
{
	public static char findDifference(String s, String t)
	{
		// Initialize result with 0
		// XOR with 0 keeps the value unchanged
		char result = 0;
		
		// Loop through first string
		for(int i = 0; i < s.length(); i++)
		{
			// XOR current character with result
			// Example:
			// result = result ^ currentCharacter
			result ^= s.charAt(i);
		}
		
		// Loop through second string
		for(int i = 0; i < t.length(); i++)
		{
			// XOR again with characters of second string
			// Matching characters cancel each other
			// because:
			// x ^ x = 0
			result ^= t.charAt(i);
		}
		
		// After all cancellations,
		// only the extra character remains
		return result;
	}

	public static void main(String[] args)
	{
		// Original string
		String str1 = "nars";
		
		// Second string contains one extra character: 'i'
		String str2 = "narsi";
		
		// Call method to find extra character
		char difference = findDifference(str1, str2);
		
		// Print result
		System.out.println("Difference: " + difference);
	}
}