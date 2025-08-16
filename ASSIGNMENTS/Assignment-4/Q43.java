// 43) WAP to convert binary number into decimal number

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter a binary number : ");
        int n = se.nextInt();
        int sum = 0;
        int i = 0;
        while (n > 0) {
            int rem = n % 10;
            sum += rem * (1 << i);// (int) Math.pow(2,i);
            n = n / 10;
            i++;

        }
        System.out.println("The decimal number is : " + sum);

    }
}
