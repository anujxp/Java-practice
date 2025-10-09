
//     X
//    X X
//   X__X
//  X____X
// X X X X X
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter Row");
        int n = se.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                if(k == 1||k==i||i == n)
                System.out.print("X ");
                else
                System.out.print("_");
            }
            System.out.println();
        }
    }
}