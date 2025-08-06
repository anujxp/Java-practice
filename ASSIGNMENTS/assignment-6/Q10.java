// Q.10.
// Write a program to cyclically rotate array by one.
import java.util.Scanner;

class Test{
    public static void rotateByOne(int[] arr) {
    int n = arr.length;
    reverse(arr, 0, n - 1);     // reverse whole array
    reverse(arr, 0, 0);         // reverse first element (no effect)
    reverse(arr, 1, n - 1);     // reverse rest
}

public static void reverse(int[] arr, int start, int end) {
    while (start < end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array a and b");
        int n1 = sc.nextInt();


        System.out.println("Enter the Element of array 1 :");
        int arr[] = new int[n1];
        for (int i = 0; i < n1; i++) {
         arr[i] = sc.nextInt();

        }
        int n = arr.length;
        int temp = arr[n - 1];
        for (int i = n - 1; i > 0; i--)
            arr[i] = arr[i - 1];
        arr[0] = temp;
        for (int i : arr) {
            System.out.print(i + " ");
        }
        rotateByOne(arr);
        // rotateByOne(arr);
        rotateByOne(arr);
        rotateByOne(arr);
        System.out.println();
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

}