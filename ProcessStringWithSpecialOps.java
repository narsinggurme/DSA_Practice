package com.may01;

public class ProcessStringWithSpecialOps 
{
	public static char processStringWithSpecialOps(String s, long k) 
	{
		StringBuilder sb = new StringBuilder();
		for(char c: s.toCharArray())
		{
			if(c == '*')
			{
				if(sb.length() > 0)
				sb.deleteCharAt(sb.length()-1);
			}
			else if(c == '#')
			{
				sb.append(sb);
			}
			else if(c == '%')
			{
				sb.reverse();
			}
			else
			{
				sb.append(c);
			}
		}
		
		if(sb.length() > k)
		{
			return sb.charAt((int) k);
		}
		
		
		return '.';
	}

	public static void main(String[] args) 
	{
		String s = "z*#*";
		int k = 0;
		System.out.println(processStringWithSpecialOps(s, k));
		
	}

}
