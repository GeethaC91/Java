package com.company;

public class ArrayAvg {
        public static void main(String[] args) {
            int arr[][] = new int[][]{
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9},
                    {10, 11, 12},
                    {1, 6, 9}
            };
            for (int i = 0; i < 5; i++) {
                int sum = 0,avg=0;
                for (int j = 0; j < 3; j++) {
                    sum = sum + arr[i][j];
                }
                avg=sum/3;
                System.out.println("the average of"+" "+"row" + " " +i+" "+ avg);
            }
        }
    }
