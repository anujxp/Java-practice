// 50) WAP to find out all the palindrome numbers between two entered numbers
import java.util.Scanner;

class PalindromeFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("\nPalindrome numbers between " + start + " and " + end + " are:");

        // Loop through each number in the specified range.
        for (int i = start; i <= end; i++) {
            
            int originalNum = i;
            int reversedNum = 0;
            int tempNum = originalNum; // Use a temporary variable to not destroy the original number.

            // This loop reverses the number.
            while (tempNum > 0) {
                // 1. Get the last digit.
                int digit = tempNum % 10;
                
                // 2. Build the reversed number.
                reversedNum = reversedNum * 10 + digit;
                
                // 3. Remove the last digit from the temp number.
                tempNum /= 10; // This is the same as tempNum = tempNum / 10;
            }

            // Check if the original number and its reversed version are the same.
            if (originalNum == reversedNum) {
                System.out.println(originalNum);
            }
        }
        sc.close();
    }
}