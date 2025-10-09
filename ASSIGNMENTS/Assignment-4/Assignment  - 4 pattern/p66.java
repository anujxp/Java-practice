
//     1
//    1*1
//   1***1
//  1*****1
// 111111111
import java.util.Scanner;

class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pyramid: ");
        int rows = scanner.nextInt();
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i) - 1; k++) {
                if (i == rows - 1 || k == 1 || k == (2 * i) - 1)
                    System.out.print("1");
                else
                    System.out.print("*");
            }   
            System.out.println();
        }

        scanner.close();
    }
}
