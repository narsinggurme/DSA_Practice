package com.may01;

import java.util.HashMap;
import java.util.Map;

public class SmallestPalindrome {

//    public static String smallestPalindrome(String s) 
//    {
//    	if(s.length() ==1)
//    	{
//    		return s;
//    	}
//
//        Map<Character, Integer> map = new HashMap<>();
//        for (char c : s.toCharArray()) 
//        {
//            map.put(c, map.getOrDefault(c, 0) + 1);
//        }
//        
//        StringBuilder left = new StringBuilder();
//        char middle = '\0';
//        
//        for(char c = 'a'; c <= 'z'; c++)
//        {
//        	if(map.containsKey(c))
//        	{
//        		int count = map.get(c);
//        		if(count % 2 != 0)
//        		{
//        			middle = c;
//        		}
//
//        		for(int i=0; i< count /2;  i++)
//        		{
//        			left.append(c);
//        		}
//
//        	}
//        }
//        String right = new StringBuilder(left).reverse().toString();
//        
//        return left.toString() + (middle=='\0' ? "" :  middle) + right;
//    }
	public static String smallestPalindrome(String s) 
	{
	    int[] freq = new int[26];

	    for (char ch : s.toCharArray()) {
	        freq[ch - 'a']++;
	    }

	    StringBuilder left = new StringBuilder();
	    char middle = '\0';

	    for (int i = 0; i < 26; i++) 
	    {
	        if (freq[i] % 2 != 0) 
	        {
	            middle = (char) (i + 'a');
	        }

	        for (int j = 0; j < freq[i] / 2; j++) 
	        {
	            left.append((char) (i + 'a'));
	        }
	    }

	    String right = new StringBuilder(left).reverse().toString();

	    return left.toString()  + (middle == '\0' ? "" : String.valueOf(middle)) + right;
	}

    public static void main(String[] args) {
        System.out.println(smallestPalindrome("babab"));
        System.out.println(smallestPalindrome("daccad"));
        System.out.println(smallestPalindrome("a"));


    }
}