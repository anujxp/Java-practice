// 7. WAP to search an element in array using binary search.

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

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for better formatting

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop for comparisons and swaps
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for better formatting

        System.out.println("Enter the element to search:");
        int key = se.nextInt();
        int result = -1;

        while (n > 0) {
            int mid = n / 2;
            if (arr[mid] == key) {
                result = mid;
                break;
            } else if (arr[mid] > key)
                n = mid - 1;
            else
                n = mid + 1;
        }
        if (result == -1)

            System.out.println("Element not found");

        else
            System.out.println("Element found at index " + result);

        se.close();
    }
}
