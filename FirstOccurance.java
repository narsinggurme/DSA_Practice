package com.may01;

public class FirstOccurance 
{
	public static int firstOccurance(String str1, String str2)
	{
		return str1.indexOf(str2);
//		for(int i=0; i<=str1.length()- str2.length(); i++)
//		{
//			
//			int j=0;
//			while(j < str2.length() && str1.charAt(i+j) == str2.charAt(j))
//			{
//				System.out.println(
//				        "i = " + i +
//				        ", j = " + j +
//				        ", str1 char = " + str1.charAt(i + j) +
//				        ", str2 char = " + str2.charAt(j)
//				    );
//				j++;
//			}
//			if(j == str2.length())
//			{
//				return i;
//			}
//		}
//		
//		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "singnar";
		String str2 = "nars";
		System.out.println(firstOccurance(str, str2));
	}

}
