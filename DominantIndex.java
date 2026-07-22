package com.may01;

public class DominantIndex 
{
	public static int dominantIndex(int[] nums) 
	{
		int max = 0;
		int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[max]) {
            	max = i;
            }
        }

        for (int i = 0; i < n; i++) 
        { 
            if (i != max && nums[max] < 2 * nums[i]) 
            {
                return -1;
            }
        }

        return max;
	}

	public static void main(String[] args) 
	{
		int[] arr = { 1, 2, 3, 4 };
		System.out.println(dominantIndex(arr));
	}

}
