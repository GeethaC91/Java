import java.util.*;
public class ArrayUtil1 {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int b=3;
        System.out.println("The given int array is"+" "+Arrays.toString(a));
        //System.out.println("The value is"+ " "+s);
        int index=indexOf(a,b);
        System.out.println("The index of"+" "+b+" "+"is"+" "+index);
        int int1=intAt(a,b);
        System.out.println("The int at index"+" "+b+" "+"is"+" "+int1);
        int len=length(a);
        System.out.println("The length of array"+" "+"is"+" "+len);
        boolean b1=contains(a,b);
        System.out.println("The status is "+" "+b1);
    }
    public static int indexOf(int[] a,int b)
    {
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
            {
             return i;
            }
        }
        return -1;
    }
    public static int intAt(int[] a,int b)
    {
        //if(b<a.length && b>=0)
        return a[b];
        //else
           // System.out.println("Please recheck");
        //return -1;
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
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==b)
            {
                return true;
            }
        }
        return false;
    }
}

