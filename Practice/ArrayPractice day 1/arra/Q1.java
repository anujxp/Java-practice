// input: arr[] = [12, 35, 1, 10, 34, 1]
// Output: 34
// Explanation: The largest element of the array is 35 and the second largest element is 34.
import java.util.Scanner;

class Test {
    static int find(int[] arr, int k) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }

        }
        return arr[n - k ];
    }

    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter size of array:");
        int n = se.nextInt();

        System.out.println("Enter Element of array:");
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = se.nextInt();
        }
        
        System.out.println(find( arr, 2));

        se.close();
    }
}