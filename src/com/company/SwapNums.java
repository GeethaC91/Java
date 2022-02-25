package com.company;
import java.util.Scanner;
public class SwapNums {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        a = sc.nextInt();
        System.out.println("Enter Second number");
        b = sc.nextInt();
        System.out.println("Before Swapping"+" "+"a="+a+"\t"+"b="+b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("After Swapping"+" "+"a="+a+"\t"+"b="+b);
    }
}
