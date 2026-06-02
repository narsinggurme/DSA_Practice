package com.may01;

public class ThirdMax
{
	public static int thirdMax(int[] arr)
	{
		Long first = null;
		Long second = null;
		Long third = null;
		
		for(int n : arr)
		{
			long k = n;
			
			//Skip duplicates
			if((first != null && k == first) || (second !=null && k == second) || (third !=null && k == third))
			{
				continue;
			}
			
			if(first == null || k > first)
			{
				third = second;
				second = first;
				first = k;
			}
			else if(second == null || k > second)
			{
				third = second;
				second = k;
			}
			else if(third == null || k > third)
			{
				third = k;
			}
			
		}
		
		return third==null ? first.intValue() : third.intValue();
		
	}

	public static void main(String[] args) {
		int[] arr = {2,2,3,1};
		System.out.println(thirdMax(arr));

	}

}
