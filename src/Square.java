import java.util.*;
public class Square
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number");
        int i=s.nextInt();
        System.out.println(square(i));
    }
    public static int square(int i)
    {
        return(i*i);
    }
}
