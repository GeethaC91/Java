import java.util.Scanner;

public class PrintCongrats
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        printCon(num);
    }
    public static void printCon(int num)
    {
        if(num>0 && num<=100)
        {
            System.out.println("Congrats");
        }
        else
        {
            System.out.println("Sorry");
        }
    }
}
