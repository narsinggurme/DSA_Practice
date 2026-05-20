package com.may01;


public class FirstMissingPositive 
{
	public static int missingPositive(int[] arr)
	{
//		HashSet<Integer> set = new HashSet<>();
//		for(int n : arr)
//		{
//			set.add(n);
//		}
//		System.out.println(set);
//		for(int i=1; i<=arr.length; i++)
//		{
//			System.out.println(i);
//			if(!set.contains(i))
//			{
//				return i;
//			}
//		}
//		
//		return arr.length +1;
		
		int n = arr.length;
		for(int i=0; i<arr.length; i++)
		{
			while(arr[i]>0 && arr[i] <=n && arr[arr[i] -1] != arr[i])
			{
				int index = arr[i]-1;
				int temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
			}
		}
		
		for(int i=0; i<n; i++)
		{
			if(arr[i] != i+1)
			{
				return i+1;
			}
		}
		return n+1;
		
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {3,4,-1,1};
		System.out.println("Missing first positive: "+missingPositive(arr));

	}

}
