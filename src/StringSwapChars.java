import java.util.Arrays;
import java.util.*;

public class StringSwapChars {
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
        char result[]=s.toCharArray();
        System.out.println("Before Swapping the given chars"+ Arrays.toString(result));
        char a=result[i];
        result[i]=result[j];
        result[j]=a;
        System.out.println("After Swapping the given chars"+ Arrays.toString(result));
    }
}

