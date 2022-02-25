package com.company;
import java.util.Scanner;
public class NumberGame
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int compNum=(int)(Math.random()*100);
        System.out.println(compNum);
        while (true)
        {
            System.out.println("Guess the Number");
            int input=sc.nextInt();
            if (input==compNum)
            {
                System.out.println("You guessed it right");
                break;
            }
            System.out.println("Sorry try again");
            if (input>compNum)
            {
                System.out.println("Hint: the actual number is less than the number you typed ");
            }
            else
            {
                System.out.println("Hint: the actual number is greater than the number you typed");
            }
        }
    }
}
