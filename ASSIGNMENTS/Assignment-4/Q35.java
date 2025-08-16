// 35) WAP to count number of digits

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se  = new Scanner(System.in);
        System.out.println("Enter a number to check ");
        int number = se.nextInt();
        
        // int number = 12345;
        int digitCount = 0;

        while (number != 0) {
            number = number / 10;
            digitCount++;
        }

        System.out.println("Number of digits = " + digitCount);

    }
}
