// 5
// 54
// 543
// 5432
// 54321

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();

        for (int i = n; i > 0; i--) {
            for (int j = n; j >= i; j--) {
                if (j >= i)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}