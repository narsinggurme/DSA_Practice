package com.march;

public class ReverseString2
{
    public static void main(String[] args) {
        String str = "Nar sing  ";
        str = str.replaceAll("\\s","");

        String reversed = new StringBuilder(str).reverse().toString();

        System.out.println("reversed string:" + reversed);
    }
}
