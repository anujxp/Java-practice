
// 1
// 12
// 1 3
// 1  4
// 12345
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i == n || j == 1 || i == j)
                    System.out.print(j);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        se.close();
    }
}