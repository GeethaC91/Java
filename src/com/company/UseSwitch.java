package com.company;

import java.util.Scanner;

public class UseSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        float a = sc.nextFloat();
        System.out.println("Enter second number");
        float b = sc.nextFloat();
        float result;
        System.out.println("Enter the arithmetic operation you want to perform");
        System.out.println("'+'-->for addition"+"\t"+"'-'-->for subtraction"+"\t"+"'*'-->for multiplication"+"\t"+"'/'-->for division");
        char op = sc.next().charAt(0);
            switch (op) {
                case '+':
                    result = a + b;
                    System.out.println("After performing sum the result is" + " " + result);
                    break;
                case '-':
                    result = a - b;
                    System.out.println("After performing subtraction the result is"+ " " + result);
                    break;
                case '*':
                    result = a * b;
                    System.out.println("After performing multiplication the result is"+ " " + result);
                    break;
                case '/':
                    result = a / b;
                    System.out.println("After performing division the result is"+ " " + result);
                    break;
                default:
                    System.out.println("Please enter valid operation");
            }
        }

            }
