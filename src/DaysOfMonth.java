import java.util.Scanner;

public class DaysOfMonth
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a month from 1-12");
        int m = sc.nextInt();
        printDayOfMonth(m);
    }
    public static void printDayOfMonth(int month)
    {
        if(month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month ==12)
        {
            System.out.println("The month you entered has 31 days");
        }
        else if(month == 4 || month == 6 || month == 9 || month == 11)
        {
            System.out.println("The month you entered has 30 days");
        }
        else if(month == 2)
        {
            System.out.println("The month you entered has 28 or 29 days depending on year");
        }
        else
        {
            System.out.println("Invalid input");
        }

    }
}
