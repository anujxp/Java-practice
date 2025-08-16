// 51) WAP to reverse all the numbers between two entered numbers
import java.util.Scanner;

class ReverseNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("\nOriginal -> Reversed");
        System.out.println("--------------------");

        // Loop through each number from start to end.
        for (int i = start; i <= end; i++) {
            
            int originalNum = i;
            int reversedNum = 0;

            // This while loop reverses the current number (originalNum).
            while (originalNum != 0) {
                // Get the last digit of the number.
                int digit = originalNum % 10;
                
                // Append the digit to the reversed number.
                reversedNum = reversedNum * 10 + digit;
                
                // Remove the last digit from the original number.
                originalNum /= 10;
            }

            // Print the original number and its reversed counterpart.
            System.out.println(i + " -> " + reversedNum);
        }
        sc.close();
    }
}