import java.util.Scanner;

public class GradeCalculator
{
        public static void main(String[] args)
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Marks in first subject");
            int s1 = sc.nextInt();
            System.out.println("Enter Marks in second subject");
            int s2 = sc.nextInt();
            System.out.println("Enter Marks in third subject");
            int s3 = sc.nextInt();
            System.out.println("Enter Marks in fourth subject");
            int s4 = sc.nextInt();
            System.out.println("Enter Marks in fifth subject");
            int s5 = sc.nextInt();
            percentageCalculator(s1,s2,s3,s4,s5);
        }
        public static void percentageCalculator(int s1,int s2, int s3,int s4,int s5) {
            float marks_scored = s1 + s2 + s3 + s4 + s5;
            float tot_marks = 500;
            float p = ((marks_scored * 100) / tot_marks);
            System.out.println("You scored" + " " + p + "%");
            gradeCalculator(p);
        }
        public static void gradeCalculator(float p)
        {
            if(p>=80)
            {
                System.out.println("Grade A");
            }
            else if((p>=70) && (p<80))
            {
                System.out.println("Grade B");
            }
            else if((p>=60) && (p<70))
            {
                System.out.println("Grade C");
            }
            else if(p<60)
            {
                System.out.println("Grade D");
            }
            else
            {
                System.out.println("Something wrong");
            }
        }
}
