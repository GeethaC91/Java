package com.company;

public class Calculator
{
    public static void main(String[] args) {
        System.out.println(sum(5, 5));
        System.out.println(sub(5, 5));
        System.out.println(multiply(5, 5));
        System.out.println(divide(5, 5));
    }
        public static int sum(int a, int b)
        {
            return(a+b);

        }
        public static int sub(int a, int b)
        {
            return(a-b);
        }
    public static int multiply(int a, int b)
    {
        return(a*b);
    }
    public static int divide(int a, int b)
    {
        int c=b/a;
        return(c);
    }


}
