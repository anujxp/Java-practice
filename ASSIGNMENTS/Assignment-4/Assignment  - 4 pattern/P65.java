import java.util.Scanner;

class PascalsTriangle {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for Pascal's Triangle: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {

            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }

            int number = 1;

            for (int k = 0; k <= i; k++) {
                System.out.print(number + " ");
                number = number * (i - k) / (k + 1);
            }
            System.out.println();
        }

        scanner.close();
    }
}