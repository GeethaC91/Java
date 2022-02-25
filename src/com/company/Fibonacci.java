package com.company;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit of fibonacci series");
        int num = sc.nextInt();
        printFibonacci(num);
    }
    public static void printFibonacci(int num)
    {
        int f1=0,f2=1,f3;
        System.out.print(f1);
        System.out.print("\t"+f2);
        for(int i=1;i<=num;i++)
        {
         f3=f1+f2;
         System.out.print("\t"+f3);
         f1=f2;
         f2=f3;
        }
    }
}
