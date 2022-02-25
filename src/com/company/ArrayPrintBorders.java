package com.company;

public class ArrayPrintBorders {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {1, 6, 9}
        };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(i==0 || i==arr.length-1 || j==0 || j==arr[0].length-1)
                {
                    System.out.print(arr[i][j]+"\t");
                }
                else
                {
                    System.out.print("\t");
                }
            }
            System.out.println(" ");
        }
    }
}

