
// 123456
// 54321
// 1234
// 321
// 12
// 1
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                for (int j = 1; j <= n - i; j++)
                    System.out.print(j);
            else
                for (int j = n-i; j > 0; j--) {
                    System.out.print(j);
                }
            System.out.println();
        }
    }
}