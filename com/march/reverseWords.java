package com.march;

public class reverseWords {
    public static String reverse(String str)
    {
        String[] words = str.split(" ");
        StringBuilder sb = new StringBuilder();

        for(int i = words.length-1; i >=0; i--)
        {
            sb.append(words[i]).append(" ");
        }

        return sb.toString();

    }
    public static void main(String[] args) {
        String str = "java is fun";

        String result = reverse(str);
        System.out.println("result: " + result);
    }
}

