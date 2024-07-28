import java.util.*;

public class greater_num {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number = ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number = ");
        double b = sc.nextDouble();

        if (a == b)
        {
            System.out.print("Both the numbers are same, get off that fent asap!");
        }
        else if (a > b)
        {
            System.out.print("Nigga the first number is greater.");
        }
        else
        {
            System.out.print("Nigga the second number is greater.");
        }
    }
}