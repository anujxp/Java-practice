
// 42) WAP to find out HCF of a number
import java.util.Scanner;

class Q42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        int hcf = 1;

        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0)
                hcf = i;
        }

        System.out.println("HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
