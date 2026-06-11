package com.may01;

public class NextGreatestLetter 
{
	public static char nextGreatestLetter(char[] letters, char target) 
	{
//		int low = 0;
//		int high = letters.length-1;
//		while(low <= high)
//		{
//			int mid = low + (high - low)/2;
//			
//			if(letters[mid] > target)
//			{
//				high = mid - 1;
//			}
//			else if(letters[mid] <= target)
//			{
//				low = mid + 1;
//			}
//		}
//		System.out.println("low: " + low);
//		return letters[low % letters.length] ;
		
		for(int i=0; i<letters.length ; i++)
		{
			if(letters[i] > target)
			{
				return letters[i];
			}
		}
		
		return letters[0];
	}

	public static void main(String[] args)
	{
		char[] letters =  {'x','x','y', 'z'};
		char target = 'z';
		System.err.println(nextGreatestLetter(letters, target));

	}

}
