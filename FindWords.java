package com.may01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindWords 
{
	public static String[] findWords(String[] words) 
	{
	    String row1 = "qwertyuiop";
	    String row2 = "asdfghjkl";
	    String row3 = "zxcvbnm";

	    List<String> result = new ArrayList<>();

	    for (String word : words) 
	    {
	        String lowerWord = word.toLowerCase();

	        String row;

	        if (row1.indexOf(lowerWord.charAt(0)) != -1)
	        {
	            row = row1;
	        } 
	        else if (row2.indexOf(lowerWord.charAt(0)) != -1) 
	        {
	            row = row2;
	        } 
	        else 
	        {
	            row = row3;
	        }

	        boolean valid = true;

	        for (char ch : lowerWord.toCharArray()) 
	        {
	            if (row.indexOf(ch) == -1) 
	            {
	                valid = false;
	                break;
	            }
	        }
	        if (valid) 
	        {
	            result.add(word);
	        }
	    }
	    return result.toArray(new String[0]);
	}
	
	public static void main(String[] args)
	{
        String[] words = {"Hello","Alaska","Dad","Peace"};
        System.out.println(Arrays.toString(findWords(words)));

	}

}
