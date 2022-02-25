import java.util.*;
public class RectangleArea{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length");
        int l=s.nextInt();
        System.out.println("Enter breadth");
        int b=s.nextInt();
        System.out.println("the area of triangle-->" + area(l,b));
    }
    public static int area(int l,int b)
    {
        int a=l*b;
        return(a);
    }
}

