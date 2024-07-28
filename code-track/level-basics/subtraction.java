import java.util.Scanner;

public class subtraction {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number = ");
        double b = sc.nextDouble();

        double sub = a - b;
        System.out.print("The subtraction of the numbers are = " + sub);

    }
}
