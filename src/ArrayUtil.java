import java.util.*;
public class ArrayUtil {
    public static void main(String[] args)
    {
     int[] a={1,2,3,4,5};
     int b=2;
        System.out.println("The given int array is"+" "+Arrays.toString(a));
     int index=indexOf(a,b);
        System.out.println("The index of"+" "+b+" "+"is"+" "+index);
        int char1=charAt(a,b);
        System.out.println("The char at index"+" "+b+" "+"is"+" "+char1);
        int len=length(a);
        System.out.println("The length of array"+" "+"is"+" "+len);
        boolean b1=contains(a,b);
        System.out.println("The status is "+" "+b1);
    }
    public static int indexOf(int[] a,int b)
    {
        int in=0;
     for(int i=0;i<a.length;i++)
     {
         if(a[i]==b)
         {
             in = i;
         }
     }
     return in;
    }
    public static int charAt(int[] a,int b)
    {
        return a[b];
    }
    public static int length(int[] a)
    {
        int count=0;
        for(int i:a)
        {
            count++;
        }
        return count;
    }
    public static boolean contains(int[] a,int b)
    {
        int count=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
            {
                count++;
            }
        }
        if(count>0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
