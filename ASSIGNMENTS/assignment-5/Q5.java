
// 5. WAP to replace all element with 0 which is multiple of 5
import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner se = new Scanner(System.in);
        int arr[] = new int[5];

        System.out.println("Enter the array elements");
        for (int i = 0; i < 5; i++) {
            arr[i] = se.nextInt();
        }
        System.out.println("Before manipulation");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] % 5 == 0)
                arr[i] = 0;
        }

        System.out.println("\nAfter manipulation");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        se.close();
    }
}
