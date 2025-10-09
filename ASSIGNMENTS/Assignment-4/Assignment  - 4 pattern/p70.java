// * * * * *
//  * * * *
//   * * *
//    * *
//     *
import java.util.Scanner;

class Test {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for uposit traingle Triangle: ");
        int rows = scanner.nextInt();
        for (int i = rows; i > 0; i--) {

            for (int j = 0; j < rows-i; j++) {
                System.out.print(" ");
            }
            for (int k =i; k >= 1; k--) {
               System.out.print("* ");
            }   
            System.out.println();
        }

        scanner.close();
        
    }
}
