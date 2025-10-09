// *********
//  *******
//   *****
//    ***
//     *
import java.util.Scanner;

class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Triangle: ");
        int rows = scanner.nextInt();
        for (int i = rows; i > 0; i--) {

            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int k =(2 * i) - 1; k >= 1; k--) {
               System.out.print("*");
            }   
            System.out.println();
        }
        for (int i = 0; i < rows; i++) {

            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars (2*(rows-i)-1 stars in each row)
            for (int k = 0; k < 2 * (rows - i) - 1; k++) {
                System.out.print("*");
            }

            // move to next line
            System.out.println();
        }

        scanner.close();
    }
}
