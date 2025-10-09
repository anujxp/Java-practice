// 12345
//  1234
//   123
//    12
//     1

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = 0; j < n - i; j++)
                System.out.print(" ");
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }

        se.close();
    }
}