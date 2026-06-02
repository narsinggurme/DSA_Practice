package com.may01;

public class RotateString
{
	public static boolean rotateString(String s, String goal)
	{
		if(s.length() != goal.length())
		{
			return false;
		}
		
		return (s+s).contains(goal);
	}

	public static void main(String[] args) 
	{
		String str1 = "abcde";
		String str2 = "cdeab";
		System.out.println("Result: " + rotateString(str1, str2));

	}

}
