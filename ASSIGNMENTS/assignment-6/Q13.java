// Find the first repeating element in array of integer
import java.util.Scanner;

class ArrayUtil {
    int firstRepeatingElement(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    return arr[i];
                }
            }
        }
        return -1;
    }
}

class FirstRepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements of array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayUtil util = new ArrayUtil();
        int result = util.firstRepeatingElement(arr, n);

        if (result == -1) {
            System.out.println("No repeating element found");
        } else {
            System.out.println("First repeating element = " + result);
        }

        sc.close();
    }
}
