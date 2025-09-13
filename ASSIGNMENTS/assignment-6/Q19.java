/*
Q.19) Find Maximum product contigeous sub array 

Given an array Arr[] that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.
Example 1:
Input:
N = 5
Arr[] = {6, -3, -10, 0, 2}
Output: 180
Explanation: Subarray with maximum product
is [6, -3, -10] which gives product as 180.
Example 2:
Input:
N = 6
Arr[] = {2, 3, 4, 5, -1, 0}
Output: 120
Explanation: Subarray with maximum product
is [2, 3, 4, 5] which gives product as 120.
*/

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        // int[] arr = {6, -3, -10, 0, 2};
        int[] arr = new int[n];
        System.out.println("Enter elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int product = 1;
            for (int j = i; j < arr.length; j++) {

                product *= arr[j];
                if (max < product) {
                    max = product;
                }

            }

        }
        System.out.println(max);

    }

}