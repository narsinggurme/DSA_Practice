package com.may01;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionOfArray 
{
	public static int[] interSection(int []arr1, int[] arr2)
	{
		Set<Integer> set = new HashSet<Integer>();
		Set<Integer> resultSet = new HashSet<Integer>();
		
		for(int num: arr1)
		{
			set.add(num);
		}
		
		for(int num : arr2)
		{
			if(set.contains(num))
			{
				resultSet.add(num);
			}
		}
		
		int[] result = new int[resultSet.size()];
		int index = 0;
		for(int num : resultSet)
		{
			result[index++] = num;
		}
		return result;
	}

	public static void main(String[] args)
	{
		int arr[] = {1,2,3};
		int arr2[] = {2,3,4,1};
		
		System.out.println(Arrays.toString(interSection(arr, arr2)));

	}

}
