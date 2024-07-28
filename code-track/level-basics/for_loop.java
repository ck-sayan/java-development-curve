public class for_loop {
    public static void main(String args[]){

        System.out.print("Print the numbers from 1 to infinity");
        // for(Intialisation; condition; updation;)
        // This is an example of a finite loop.
        for(int counter=0; ; counter += 1) /* (counter++) also can be used. */
        {
            System.out.println(counter);

        // This is an example of an infinite loop.

        /* for(int i=0; ;i=i+1){
            System.out.println("This is an infinite loop!"); */

        }
    }
}