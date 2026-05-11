package com.may01;

import java.util.Arrays;

public class ReversAnArray {
	public static void reverseArray(char[] s) {
		int left = 0;
		int right = s.length - 1;

		while (left < right) {
			char temp = s[left];
			s[left] = s[right];
			s[right] = temp;

			left++;
			right--;
		}

	}

	public static void main(String[] args) {
		char[] arr = { 'n', 'a', 'r' };

		reverseArray(arr);
		System.out.println(Arrays.toString(arr));
	}

}
