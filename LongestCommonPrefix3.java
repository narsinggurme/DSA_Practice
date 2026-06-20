package com.may01;

public class LongestCommonPrefix3 
{
	public static String commonPrefix(String[] arr)
	{
		String prefix = arr[0];
		for(int i=1;  i<arr.length; i++)
		{
			while(!arr[i].startsWith(prefix))
			{
				prefix = prefix.substring(0, prefix.length() -1 );

				if(prefix.isEmpty())
				{
					return "";
				}
			}
		}
		return prefix;
		
//		StringBuilder sb = new StringBuilder();
//		sb.append(arr[0]);
//		for(int i=1; i<arr.length; i++)
//		{
//			while(!arr[i].startsWith(sb.toString()))
//			{
//				System.out.println("Prefix: " + sb.toString());
//				sb.deleteCharAt(sb.length()-1);
//				
//				if(sb.isEmpty())
//				{
//					return "";
//				}
//			}
//		}
//		
//		
//		return sb.toString();
	}

	public static void main(String[] args) 
	{
		String[] arr = {"flower","flow","flight"};
		System.out.println(commonPrefix(arr));
	}
}
