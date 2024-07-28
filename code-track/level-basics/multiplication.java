import java.util.*;
public class multiplication {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number = ");
        double b = sc.nextDouble();

        double product = a * b;

        System.out.println("The product of the numbers are = " + product);

    }
}
