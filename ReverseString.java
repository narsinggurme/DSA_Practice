package com.march;

public class ReverseString
{
    public static void main(String[] args) {
        String str = "Nar sing  ";
        str = str.trim().replaceAll("\\s", "");

        StringBuilder rev = new StringBuilder();

        for (int i=str.length()-1; i>=0; i--)
        {
            char c = str.charAt(i);
             rev.append(c);
        }

        System.out.println("Reversed String: " + rev);
    }
}
