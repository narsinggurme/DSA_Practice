package com.may01;

public class IntToRoman 
{
	public static String intToRoman(int num)
	{
		int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };

		String[] symbols = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

		StringBuilder result = new StringBuilder();

		System.out.println("Initial Number: " + num);
		System.out.println("--------------------------------");

		for (int i = 0; i < values.length; i++) 
		{
			System.out.println("Checking Value: " + values[i] + " Symbol: " + symbols[i]);

			while (num >= values[i]) 
			{
				System.out.println();
				System.out.println("num >= " + values[i] + " TRUE");

				System.out.println("Before Append Result: " + result.toString());

				result.append(symbols[i]);

				System.out.println("After Append Result: " + result.toString());

				System.out.println("Subtracting: " + values[i] + " from " + num);

				num -= values[i];

				System.out.println("Remaining Number: " + num);
			}

			System.out.println("--------------------------------");
		}

		System.out.println("Final Roman Number: " + result.toString());

		return result.toString();
	}

	public static void main(String[] args)
	{
		System.out.println();
		System.out.println("Answer: " + intToRoman(1234));
	}
}