import java.util.Scanner;

public class StringSwapChars1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine();
        System.out.println("Enter index of i");
        int i = sc.nextInt();
        System.out.println("Enter index of j");
        int j = sc.nextInt();
        swapChars(s,i,j);
    }
    public static void swapChars(String s,int i,int j)
    {
        System.out.println("Before Swapping"+" "+s);
        String result="";
        result=result+s.substring(0,i)+s.charAt(j)+s.substring(i+1,j)+s.charAt(i)+s.substring(j+1,s.length());
        System.out.println("After Swapping"+" "+result);
    }
}
