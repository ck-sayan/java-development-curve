import java.util.*;

public class ques3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the numbers within 1, 2, 3 = ");
        int x = sc.nextInt();

        /*if (x == 1){
            System.out.println("Hello Nigga");
        }
        else if (x == 2){
            System.out.println("Namaskaar Kaluye");
        }
        else if (x == 3){
            System.out.println("Bonjour Nigga");
        }
        else {
            System.out.println("Are you dumb or what, I said enter the numbers within 1, 2, and 3");
        }*/

        switch(x) {
            case 1: System.out.println("hello, world!");
            break;
            case 2: System.out.println("namaskaar, duniya!");
            break;
            case 3: System.out.println("bonjour le monde!");
            break;
            default: System.out.println("Are you dumb or what, I said enter the numbers within 1, 2, and 3");
        }
    }
}
