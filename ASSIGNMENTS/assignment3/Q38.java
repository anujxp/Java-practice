// Write a Java program to input day number and print week day. 

import java.util.Scanner;

public class Q38 {
     public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the day number (1-7): ");
        int dayNumber = in.nextInt();

        String dayName;

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day number. Please enter a number between 1 and 7.";
                break;
        }

        System.out.println("The day of the week is: " + dayName);

        in.close(); // Close the scanner to prevent resource leaks
    }
    
}
