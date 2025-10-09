
// 1
// 12
// 1 3
// 1  4
// 1 3
// 12
// 1
import java.util.Scanner;

class NumberPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Peak Width : ");
        int n = sc.nextInt();

        // Increasing part
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        // Decreasing part
        for (int i = n - 1; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
