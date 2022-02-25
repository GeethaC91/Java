import java.util.Scanner;
public class CircleArea2{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter radius");
        int r=s.nextInt();
        area(r);
    }
    public static void area(int r)
    {
        double a=3.14*r*r;
        System.out.println("the area of circle with radius"+" "+ r + " "+ "is" + '\n' +a);
    }
}
