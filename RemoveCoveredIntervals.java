package com.may01;

import java.util.Arrays;

public class RemoveCoveredIntervals 
{
	public static int removeCoveredIntervals(int[][] intervals) 
	{
		Arrays.sort(intervals, (a, b) -> {
			if (a[0] == b[0]) {
				return b[1] - a[1];
			}

			return a[0] - b[0];
		});
		System.out.println(Arrays.deepToString(intervals));
		int count =0;
		int maxEnd = 0;
		for(int[]interval: intervals)
		{
			if(interval[1] > maxEnd)
			{
				count++;
				maxEnd = interval[1];
			}
			
		}
		
		return count;
	}

	public static void main(String[] args) 
	{
//		int[][] intervals = {{1,4},{3,6},{2,8}};
//		int[][] intervals = {{1,4},{2,3}};
		int[][] intervals = {{1,2},{1,4},{3,4}};

		System.out.println(removeCoveredIntervals(intervals));
	}

}
