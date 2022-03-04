import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter your weight in kilograms");
        float weight = sc.nextFloat();
        System.out.println("Please enter your height in meters");
        float height = sc.nextFloat();
        float bmi=weight/(height*height);
        System.out.println("Your weight in kg:"+" "+weight);
        System.out.println("Your height in m:"+" "+height);
        System.out.println("Your BMI is"+" "+bmi);
        System.out.println("Test Git");
    }
}
