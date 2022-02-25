package com.company;

public class ArrayColAvg1 {
    public static void main(String[] args) {
        int arr[][] = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {1, 6, 9}
        };
        int c1 = 0, c2 = 0, c3 = 0;
        int col1[] = new int[5];
        int col2[] = new int[5];
        int col3[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (j == 0) {
                    col1[c1] = arr[i][j];
                    c1++;
                } else if (j == 1) {
                    col2[c2] = arr[i][j];
                    c2++;
                } else {
                    col3[c3] = arr[i][j];
                    c3++;
                }
            }
        }
            int column1=avgCol(col1);
            System.out.println("average of column1" + " " + column1);
            int column2=avgCol(col2);
            System.out.println("average of column2" + " " + column2);
            int column3=avgCol(col3);
            System.out.println("average of column3" + " " + column3);
        }
        public static int avgCol ( int col[])
        {
            int sum = 0, avg = 0;
            for (int i = 0; i < 5; i++) {
                sum = sum + col[i];
            }
            avg = sum / 5;
            return avg;
        }
    }

