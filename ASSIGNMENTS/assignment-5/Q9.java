
// 9. WAP to delete element from array at specific position.
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("How many numbers do you want to save?");
        int n = se.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = se.nextInt();
        }
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
        System.out.println();
        // System.out.println("Enter position to insert element: ");
        int i = 0;
        do {
            System.out.println("Enter a position to Delete an Element: or pres 0 to terminate");
            int pos = se.nextInt();
            if (pos == 0) {
                System.out.println("you have terminated the program with 0");
                break;
            }
            // checking if the position is valid (0 to n-1
            if (pos < 0 || pos > n) {
                System.out.println("Enter a valid position");
            } else if (arr[pos - 1] != 0) {

                arr[pos - 1] = 0;
                i++;
                System.out.println("Element Deleted Successfully");
            }
        } while (i < n);

        System.out.println("The Array is :");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }

        se.close();

    }

}
