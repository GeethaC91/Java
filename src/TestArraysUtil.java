import java.util.Arrays;

public class TestArraysUtil {
    public static void main(String[] args) {
        char[] ch={'g','i','t','m'};
        char[] ch1={'g','i','t','m'};
        String names[]={"geetha","gopi","abhi"};
        int[] i={1,2,3,4};
        int[] i1={1,2,3,4};
        String s = String.valueOf(ch);
        String s1 = String.valueOf(ch1);
        System.out.println("Char Array"+" "+Arrays.equals(ch,ch1));
        System.out.println(s.equals(s1));
        System.out.println("int Array"+" "+Arrays.equals(i,i1));
        System.out.println(Arrays.toString(ch)+" "+s);
        int ind=Arrays.binarySearch(i,2);
        System.out.println(Arrays.binarySearch(names,"geetha"));
        Arrays.fill(names,"hello");
        System.out.println(Arrays.toString(names));
        String cp[]=Arrays.copyOfRange(names,1,2,String[].class);
        System.out.println(Arrays.toString(cp));
        System.out.println(s.matches("[g+]"));
    }
}
