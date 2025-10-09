//    *
//   *_*
//  *___*
// *_____*
//  *___*
//   *_*
//    *
import java.util.Scanner;

class DiamondPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows (odd number): ");
        int n = sc.nextInt();

        int mid = n / 2; // middle index

        // loop through rows
        for (int i = 0; i < n; i++) {
            // spaces
            int spaces = Math.abs(mid - i);
            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            // pattern (*_ repeated)
            int stars = n - 2 * spaces;
            for (int j = 0; j < stars; j++) {
                if (j == 0|| j== stars-1)
                    System.out.print("*");
                else
                    System.out.print("_");
            }
            System.out.println();
        }
    }
}
