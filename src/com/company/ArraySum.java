package com.company;

import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float num[] = new float[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter decimal number");
            num[i] = sc.nextFloat();
        }
        getSum(num);
    }
        public static void getSum(float num[])
        {
            float sum=0;
            for(int i=0;i<num.length;i++)
            {
                sum=sum+num[i];
            }
            System.out.println("the sum of numbers you entered"+" "+sum);
        }

}
