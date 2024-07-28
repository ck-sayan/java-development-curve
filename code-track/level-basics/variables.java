// To take the input from the user use "import java.util.*"

import java.util.*;

public class variables {
    public static void main(String args[]){

        /* There are two types of data types:
        1) Primitive
        2) Non-Primitive
        
        Primitive data types: byte, short, char, 
            boolean, int, long, float, double
        
        Non-Primitive data tyoes: String, Array, Class,
            Object, Interface*/
            
        
        /*String name = "Sayan Chakraborty";
        int a = 25;
        int b = 10;
        double c = 25.25;

        int sum = a + b;
        System.out.println(sum);

        int mul = a * b;
        System.out.println(mul);
        */

        Scanner sc = new Scanner(System.in);
        // sc.next would only pass a single token.
        // sc.nextLine would pass multiple ones.
        String name = sc.nextLine();
        System.out.println(name);
    }
}
