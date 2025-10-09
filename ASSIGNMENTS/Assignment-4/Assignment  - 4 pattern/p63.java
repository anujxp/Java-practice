//     A
//    ABC
//   ABCDE
//  ABCDEEF
// ABCDEFGHI
import java.util.Scanner;

class DynamicCharacterPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the pyramid: ");
        int rows = scanner.nextInt();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < (2 * i - 1); k++) {
                if ('A' + k <= 'Z') {
                    System.out.print((char)('A' + k));
                }
            }
            
            System.out.println();
        }
        
        scanner.close();
    }
}