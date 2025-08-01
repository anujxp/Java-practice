//  Write a Java program to count total number of notes in given amount. 

import java.util.Scanner;

public class Q39 {
    // public static void main(String args[]) {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();

        int originalAmount = amount; // Store the original amount for display
        int totalNotes = 0;

        System.out.println("\nNote Denominations:");

        
        
        int notes500 = amount / 500;
        if (notes500 > 0) {
            System.out.println("500 x " + notes500 + " = " + (notes500 * 500));
            totalNotes += notes500;
            amount %= 500;
        }

        // 100 
        int notes100 = amount / 100;
        if (notes100 > 0) {
            System.out.println("100 x " + notes100 + " = " + (notes100 * 100));
            totalNotes += notes100;
            amount %= 100;
        }

        // 50 
        int notes50 = amount / 50;
        if (notes50 > 0) {
            System.out.println("50 x " + notes50 + " = " + (notes50 * 50));
            totalNotes += notes50;
            amount %= 50;
        }

        // 20 
        int notes20 = amount / 20;
        if (notes20 > 0) {
            System.out.println("20 x " + notes20 + " = " + (notes20 * 20));
            totalNotes += notes20;
            amount %= 20;
        }

        // 10
        int notes10 = amount / 10;
        if (notes10 > 0) {
            System.out.println("10 x " + notes10 + " = " + (notes10 * 10));
            totalNotes += notes10;
            amount %= 10;
        }

        // 5 
        int notes5 = amount / 5;
        if (notes5 > 0) {
            System.out.println("5 x " + notes5 + " = " + (notes5 * 5));
            totalNotes += notes5;
            amount %= 5;
        }

        //  2
        int notes2 = amount / 2;
        if (notes2 > 0) {
            System.out.println("2 x " + notes2 + " = " + (notes2 * 2));
            totalNotes += notes2;
            amount %= 2;
        }

        //  1 
        int notes1 = amount / 1; 
        if (notes1 > 0) {
            System.out.println("1 x " + notes1 + " = " + (notes1 * 1));
            totalNotes += notes1;
        }

        System.out.println("--------------------");
        System.out.println("TOTAL AMOUNT: " + originalAmount);
        System.out.println("TOTAL NOTES: " + totalNotes);

        sc.close();
    }
    
}
// }
