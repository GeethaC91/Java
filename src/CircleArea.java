import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Please Enter the radius");
        int r=s.nextInt();
        double ar=area(r);
        System.out.println("the area of circle-->" + ar);
    }
    public static double area(int r)
    {
        double a=3.14*r*r;
        return(a);
    }
}

