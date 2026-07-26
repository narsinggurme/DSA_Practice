package com.may01;

import java.util.Arrays;

public class MaxProductOf3
{
	public static int  maxProduct(int [] nums) 
	{
//      int max1 = Integer.MIN_VALUE;
//      int max2 = Integer.MIN_VALUE;
//      int max3 = Integer.MIN_VALUE;
//
//      int min1 = Integer.MAX_VALUE;
//      int min2 = Integer.MAX_VALUE;
//
//      for (int num : nums) {
//
//          if (num >= max1) {
//              max3 = max2;
//              max2 = max1;
//              max1 = num;
//          } else if (num >= max2) {
//              max3 = max2;
//              max2 = num;
//          } else if (num > max3) {
//              max3 = num;
//          }
//
//          if (num <= min1) {
//              min2 = min1;
//              min1 = num;
//          } else if (num < min2) {
//              min2 = num;
//          }
//      }
//
//      int product1 = max1 * max2 * max3;
//      int product2 = min1 * min2 * max1;
//
//      System.out.println("Three largest: "
//              + max1 + " " + max2 + " " + max3);
//
//      System.out.println("Two smallest: "
//              + min1 + " " + min2);
//
//      return Math.max(product1, product2);
  	
		Arrays.sort(nums);

       int n = nums.length;

       int p1 = nums[n-1] * nums[n-2] * nums[n-3];
       int p2 = nums[0] * nums[1] * nums[n-1];

       return Math.max(p1, p2);
  }

  public static void main(String[] args) {

      int arr[] = {1,2,3,2};

      System.out.println("Maximum Product: " + maxProduct(arr));
  }
}