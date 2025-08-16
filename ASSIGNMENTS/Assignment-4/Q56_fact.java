// 56) WAP to print factorial of all the numbers between two entered numbers

import java.util.Scanner;

// Main class
class Test{
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner se = new Scanner(System.in);
        
        // Prompt user to enter two numbers
        System.out.println("Enter two number to print factorial of bitween numbers");

        int n1 = se.nextInt(); // First number
        int n2 = se.nextInt(); // Second number

        // If n1 is less than or equal to n2, print factorials from n1 to n2
        if(n1<=n2){
            while(n1<=n2){
                int i = n1;
                // Print the factorial sequence for current number
                while(i>=1){
                    System.out.print(i );
                    if(i>1)
                        System.out.print(" x "); // Print 'x' between numbers
                    i--;
                }   
                System.out.println(); // Move to next line after each factorial
                n1++;
            }
        }
        // If n1 is greater than n2, print factorials from n2 to n1
        if(n1>n2){
            System.out.println("you have entered n2 as biggest number thats why we are give this");
            while(n2<=n1){      
                int i = n2;
                // Print the factorial sequence for current number
                while(i>=1){
                    System.out.print(i );
                    if(i>1)
                        System.out.print(" x "); // Print 'x' between numbers
                    i--;
                }   
                System.out.println(); // Move to next line after each factorial
                n2++;
            }
        }
    }
}
