package com.may01;

import java.util.Arrays;

public class FirstAndLastPositionofElement
{
    public static int[] searchRange(int[] nums, int target)
    {
        int[] res = new int[2];

        /*
         * Approach 1:
         * Use two separate binary search methods.
         *
         * res[0] = firstIndex(nums, target);
         * res[1] = LastIndex(nums, target);
         */

        /*
         * Approach 2:
         * Use one generic binary search method.
         *
         * If first = true  -> find first occurrence.
         * If first = false -> find last occurrence.
         *
         * This removes duplicate code and keeps the logic in one place.
         */
        res[0] = boundry(nums, target, true);
        res[1] = boundry(nums, target, false);

        return res;
    }

    public static int boundry(int[] nums, int target, boolean first)
    {
        int left = 0;
        int right = nums.length - 1;
        int result = -1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
            {
                // Store current position as a possible answer
                result = mid;

                if (first)
                {
                    // Search further left to find the first occurrence
                    right = mid - 1;
                }
                else
                {
                    // Search further right to find the last occurrence
                    left = mid + 1;
                }
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return result;
    }

    /*
     * Finds the first occurrence of target.
     *
     * When target is found:
     * - Save the index.
     * - Continue searching on the left side.
     *
     * Example:
     * [5,7,7,8,8,10]
     *    ^
     * If target = 7, keep moving left until the first 7 is found.
     */
    public static int firstIndex(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int first = -1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
            {
                first = mid;
                right = mid - 1;
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return first;
    }

    /*
     * Finds the last occurrence of target.
     *
     * When target is found:
     * - Save the index.
     * - Continue searching on the right side.
     *
     * Example:
     * [5,7,7,8,8,10]
     *      ^
     * If target = 7, keep moving right until the last 7 is found.
     */
    public static int LastIndex(int[] nums, int target)
    {
        int left = 0;
        int right = nums.length - 1;
        int last = -1;

        while (left <= right)
        {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target)
            {
                last = mid;
                left = mid + 1;
            }
            else if (nums[mid] > target)
            {
                right = mid - 1;
            }
            else
            {
                left = mid + 1;
            }
        }

        return last;
    }

    public static void main(String[] args)
    {
        int[] nums = {5, 7, 7, 8, 8, 10};
        int target = 7;

        System.out.println(Arrays.toString(searchRange(nums, target)));
    }
}