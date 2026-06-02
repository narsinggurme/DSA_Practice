package com.may01;

public class RansomNote 
{
	public static boolean ransomNote(String s, String t)
	{
		int[] count = new int[26];
		for(char ch : t.toCharArray())
		{
			count[ch -'a']++;
		}
		
		for(char ch : s.toCharArray())
		{
			count[ch - 'a']--
			if(count[ch-'a'] < 0)
			{
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args)
	{
		String ransomeNote = "bg";
		String magazine = "efjbdfbdgfjhhaiigfhbaejahgfbbgbjagbddfgdiaigdadhcfcj";
		
		System.out.println(ransomNote(ransomeNote, magazine ));
		
	}

}
