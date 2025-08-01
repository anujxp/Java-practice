// Write a program to input choice from user. If user enter ‘+’ as choice then calculate addition of 2 number. If Choice ‘>’ then check which number is greaterst. If choice is ‘==’ then check both number is equal or not.

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter choice (+, >, ==): ");
        String choice = sc.next();

        switch (choice) {
            case "+": System.out.println("Sum: " + (a + b)); break;
            case ">":
                if (a > b) 
                    System.out.println(a + " is greater");
                else if 
                    (b > a) System.out.println(b + " is greater");
                else
                     System.out.println("Both are equal");
                break;
            case "==":
                System.out.println(a == b ? "Equal" : "Not Equal");
                break;
            default:
                System.out.println("Invalid choice");
        }
        sc.close();

    }
}
