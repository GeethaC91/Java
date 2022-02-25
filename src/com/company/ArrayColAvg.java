package com.company;

public class ArrayColAvg {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {1, 6, 9}
        };
        for (int j = 0; j < arr[j].length; j++) {
            int sum = 0,avg=0;
            for (int i = 0; i < arr.length; i++) {
                sum = sum + arr[i][j];
            }
            avg=sum/arr.length;
            System.out.println("the average of"+" "+"column" + " " +j+" "+ avg);
        }
    }
}
