import java.util.Scanner;

public class PrintTable
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number for which you want to see table");
        int num=s.nextInt();
        print_table(num);
    }

    public static void print_table(int num)
    {
        int j=10;
        for(int i=1;i<=j;i++)
        {
            System.out.println(num+"*"+i+"="+(num*i));
        }
    }
}
