// x
// xx
// xxx
// xxxx
// xxx
// xx
// x

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Rows : ");
        int n = se.nextInt();
        int nh = n;
        if (n % 2 == 0)
            nh = n / 2;
        else
            nh = n / 2 +1;

        System.out.println("nh " + nh);
        for (int i = 0; i <= n; i++) {

            if (i < nh) {
                for (int j = 0; j <= i; j++) {
                    System.out.print("X");
                }
            }

            else if (i >= nh ) {
                for (int k = 0; k < n - i; k++)
                    System.out.print("X");

            }
            System.out.println();
        }
    }
}