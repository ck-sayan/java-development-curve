import java.util.*;

public class addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number: ");
        double b = sc.nextDouble();

        double addition = a + b;
        System.out.println("The addition of the provided numbers is: " + addition);

        sc.close();
    }
}
