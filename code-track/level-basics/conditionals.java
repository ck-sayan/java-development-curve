import java.util.*;

public class conditionals {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age nigga = ");
        double age = sc.nextDouble();

        if (age > 18)
        {
            System.out.print("You are an adult! Please go ahead and vote as if anyone gives a shit.");
        }
        else
        {
            System.out.print("You ain't an adult! Get the fuck off the voting machine.");
        }
    }
}
