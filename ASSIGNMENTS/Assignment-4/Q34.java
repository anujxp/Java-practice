//  WAP to check whether entered number is perfect or not

import java.util.Scanner;

class Test {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int i = 1, sum = 0;
        while (i < n) {
            if (n % i == 0) {
                sum += i;
            }
            i++;
        }
        if (sum == n) {
            System.out.println("Number is perfect");
        } else {
            System.out.println("Not perfect");
        }
        sc.close();
    }

}
