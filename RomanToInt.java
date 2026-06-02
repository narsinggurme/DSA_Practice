package com.may01;

import java.util.HashMap;

public class RomanToInt {

	public static int romanToInt(String s) {

		HashMap<Character, Integer> map = new HashMap<>();

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

		int total = 0;

		for (int i = 0; i < s.length(); i++) {

			int current = map.get(s.charAt(i));

			// next value
			int next = 0;
			if (i < s.length() - 1)
			{
				next = map.get(s.charAt(i + 1));
			}
			if (i < s.length() - 1 && current < next) {

				total -= current;
			}
			else
			{

				total += current;
			}

		}

		return total;
	}

	public static void main(String[] args) {

		String s = "MCMXCIV";

		System.out.println("Final Answer = " + romanToInt(s));
	}
}