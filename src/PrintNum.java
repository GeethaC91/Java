import java.util.*;
public class PrintNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = sc.nextInt();
        for (int j = 2; j <= i / 2; j++) {
            if (i % j == 0) {
                System.out.println("not prime");
                break;
            }
            if (j==i/2) {
                System.out.println("prime");
            }
        }
    }
}
