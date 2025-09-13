// Q.15
// Sub with equal 0s and 1s
// Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s. 
// Example 1:
// Input:
// n = 7
// A[] = {1,0,0,1,0,1,1}
// Output: 8
// Explanation: The index range for the 8 
// sub-arrays are: (0, 1), (2, 3), (0, 3), (3, 4), 
// (4, 5) ,(2, 5), (0, 5), (1, 6)

// Example 2:
// Input:
// n = 5
// A[] = {1,1,1,1,0}

// Output: 1

// Explanation: The index range for the 

// subarray is (3,4).

import java.util.Scanner;

class SubarrayEqual01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int count = 0;

        // Check all subarrays
        for (int i = 0; i < n; i++) {
            int zero = 0, one = 0;
            for (int j = i; j < n; j++) {
                if (arr[j] == 0) zero++;
                else one++;

                if (zero == one) {
                    count++;
                }
            }
        }

        System.out.println("Number of subarrays = " + count);

        sc.close();
    }
}
