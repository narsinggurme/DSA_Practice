package com.may01;

import java.util.Arrays;

public class PrefixCommonArray 
{
	public static int[] thePrefixCommonArray(int[] A, int[] B)
	{
		int n = A.length;
		int[] result = new int[n];
		int[] freq = new int[n+1];
		int common =0;
		
		for(int i=0; i<n; i++)
		{
			freq[A[i]]++;
			if(freq[A[i]] ==2)
			{
				common++;
			}
			
			freq[B[i]]++;
			
			if(freq[B[i]] ==2 )
			{
				common++;
			}
			
			result[i] = common;
		}
		
		return result;
		
	}
	public static void main(String[] args) 
	{
		int[] a = {2,3,1};
		int[] b = {3,1,2};
		
        System.out.println(Arrays.toString(thePrefixCommonArray(a, b)));
	}

}
