import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        String s="ASSIGNMENT";
        char ch[]=s.toCharArray();
        System.out.println(String.valueOf(ch));
        char rev[]=new char[ch.length];
        for(int i=0;i<ch.length;i++)
        {
            rev[(ch.length-1)-i]=ch[i];
        }
        System.out.println(String.valueOf(rev));
    }
}
