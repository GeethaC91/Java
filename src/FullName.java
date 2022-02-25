import java.util.*;
public class FullName {
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your first name");
        String fname = s.nextLine();
        System.out.println("Enter your last name");
        String lname = s.nextLine();
        System.out.println(fullname(fname,lname));
    }
    public static String fullname(String fname,String lname)
    {
        return(fname+lname);
    }
}
