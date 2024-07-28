import java.util.*;

public class calculator {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your choice of operation ('+', '-', '*', '/', '%') = ");
        String choice = sc.next();

        System.out.print("Enter the first number = ");
        double a = sc.nextDouble();

        System.out.print("Enter the second number = ");
        double b = sc.nextDouble();

        double result;

        switch(choice){
            case "+": result = a + b;
            System.out.print("The sum of the numbers = " + result);
            break;

            case "-": result = a - b;
            System.out.print("The difference of the numbers = " + result);
            break;

            case "*": result = a * b;
            System.out.print("The product of the numbers = " + result);
            break;

            case "/": result = a / b;
            if (b != 0){
                System.out.print("The quotient of the division = " + result);
            }
            else {
                System.out.print("INVALID INPUT \nThe denominator cannot be equal to 0");
            }
            break;

            case "%": result = a % b;
                if (b != 0){
                    System.out.print("The remainder = " + result);
                }
                else{
                    System.out.print("INVALID INPUT \nThe denominator cannot be equal to 0");
                }
            break;
        }
    }
}
