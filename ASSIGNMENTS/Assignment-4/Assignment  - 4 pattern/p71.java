// 123456789
//  1234567
//   12345
//    123
//     1
import java.util.Scanner;

class InvertedNumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();  // user input

        for (int i = 0; i < rows; i++) {

            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print numbers (2*(rows-i)-1 numbers in each row)
            for (int k = 1; k <= 2 * (rows - i) - 1; k++) {
                System.out.print(k);
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
