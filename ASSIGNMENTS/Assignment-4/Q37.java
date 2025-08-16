
//37) WAP to check whether Entered number is palindrome or not
import java.util.Scanner;

class Test {
    // Main method - entry point of the program
    public static void main(String... args) {
        // Create a Scanner object to read input from the console
        Scanner se = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.println("Enter a number to reverse");
        // Read the integer input from the user
        int n = se.nextInt();
        // Store the original number for comparison later
        int cn = n;
        // Initialize variables for remainder and reversed number
        int rem = 0, rev = 0;

        // Loop to reverse the number
        while (n != 0) {
            rem = n % 10;   // Get the last digit of the number
            // Build the reversed number
            rev = rev * 10 + rem;   // Build the reversed number
            // Remove the last digit from the original number
            n = n / 10;
        }
        System.out.println(rev);

        if (rev == cn)
            System.out.println("Enter number is palindrome");
        else
            System.out.println("Entered number is not a palindrome");

    }

}
