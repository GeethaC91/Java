package com.company;
import java.util.*;
public class SumNums {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=s.nextInt();
        System.out.println("Enter second number");
        int b=s.nextInt();
        System.out.println("Enter third number");
        int c=s.nextInt();
        System.out.println("the sum of the 3 entered numbers--->" + sum(a,b,c));
    }
    public static int sum(int i,int j,int k)
    {
        return(i+j+k);
    }
}
