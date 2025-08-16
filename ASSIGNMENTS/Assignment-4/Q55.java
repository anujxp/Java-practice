// 55) WAP to print all the odd numbers between two entered numbers
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers to print all odd numbers between them:");
        int n1 = sc.nextInt(); // First number
        int n2 = sc.nextInt(); // Second number

        // If n1 is less than or equal to n2, print odd numbers from n1 to n2
        if(n1 <= n2) {
            int i = n1;
            while(i <= n2) {
                if(i % 2 != 0) { // Check if the number is odd
                    System.out.print(i + " "); // Print the odd number
                    }
                i++; // Increment to the next number
                }
                }
                else {
            System.out.println("You have entered n1 as the bigger number, so we will print odd numbers from n2 to n1.");
            int i = n2;
            while(i <= n1) {
                if(i % 2 != 0) { // Check if the number is odd
                    System.out.print(i + " "); // Print the odd number
                    }
                i++; // Increment to the next number
                }


    }
    
}
}
