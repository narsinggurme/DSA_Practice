package com.may01;

import java.util.Arrays;

public class SumAndMultiply2 {

    static final int MOD = 1_000_000_007;

    public static int[] sumAndMultiply(String s, int[][] queries) 
    {

        int[] result = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {

            int l = queries[i][0];
            int r = queries[i][1];

            long x = 0;
            long sum = 0;

            for (int j = l; j <= r; j++) {

                int digit = s.charAt(j) - '0';

                if (digit != 0) {
                    x = (x * 10 + digit) % MOD;
                    sum += digit;
                }
            }

            result[i] = (int) ((x * (sum % MOD)) % MOD);
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] queries1 = {{0,7},{1,3},{4,6}};
        int[][] queries2 = {{0,3},{1,1}};
        int[][] queries3 = {{0,9}};

        System.out.println(Arrays.toString(sumAndMultiply("10203004", queries1)));
        System.out.println(Arrays.toString(sumAndMultiply("1000", queries2)));
        System.out.println(Arrays.toString(sumAndMultiply("9876543210", queries3)));
    }
}