
/* Online Exam System

A student enters their roll number (integer), but by mistake they enter "abc".

Which exception will occur?

How can you catch it and ask them to re-enter?

Can you use a loop to keep asking until they enter valid input?

*/

import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int roll  = 0;
        boolean valid = false;

        System.out.println("Enter your roll number:");
        while (!valid) {
            try{
                roll = sc.nextInt();
                valid = true;
            }
            catch(InputMismatchException e ){
                System.out.println("re-enter the roll number: ");
                // System.out.println("Remaining buffer: " + sc.nextLine());
                System.out.println(sc.next()); //for clearing  the buffer
                
            }
            
        }
        sc.close();
        System.out.println("Entered roll number is "+ roll);
            
            

    }
}
