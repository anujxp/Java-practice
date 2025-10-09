import java.util.Scanner;

class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();  // user input

        for (int i = 0; i < rows; i++) {

            // print leading spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }

            // print stars
            for (int k = 0; k < rows - i; k++) {
                System.out.print("* ");
            }

            // move to next line
            System.out.println();
        }

        sc.close();
    }
}
