package com.company;

import java.util.Arrays;

public class StringPalindrome {
    public static void main(String[] args)
    {
        String s="dod";
        char chars[]=s.toCharArray();
        char rev[]=new char[s.length()];
        int lastindex=s.length()-1;
        System.out.println("The actual string"+" "+s);
        for(int i=0;i<s.length();i++)
        {
            rev[lastindex-i]=chars[i];
        }
        System.out.println("The reverse of string"+" "+ Arrays.toString(rev));
        String s1=new String(rev);
        if(s.equals(s1))
        {
            System.out.println("THe string is palindrome");
        }
        else
            System.out.println("not palindrome");
    }
}

