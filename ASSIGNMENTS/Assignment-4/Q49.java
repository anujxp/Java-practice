// 49) WAP to find out all the perfect numbers between two entered numbers

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting number:");
        int n1 = sc.nextInt();
        System.out.println("Enter the ending number:");
        int n2 = sc.nextInt();

        System.out.println("Perfect numbers between " + n1 + " and " + n2 + " are:");

        
        while (n1 <= n2) {
            
            int sum = 0; 
            int i = 1;

            

            while (i <= n1 / 2) {
                if (n1 % i == 0) {
                    sum += i; // Add the divisor to the sum.
                }
                i++;
            }

            // A number is perfect if the sum of its proper divisors equals the number itself.
            // Also, a perfect number must be greater than 1.
            if (sum == n1 && n1 != 0) {
                System.out.println(n1);
            }
            
            n1++; // Move to the next number in the range.
        }
        sc.close();
    }
}