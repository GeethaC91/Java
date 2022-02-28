import java.util.*;
public class ArrayUtil1 {
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5};
        int b=3;
        System.out.println("The given int array is"+" "+Arrays.toString(a));
        int index=indexOf(a,b);
        System.out.println("The index of"+" "+b+" "+"is"+" "+index);
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

