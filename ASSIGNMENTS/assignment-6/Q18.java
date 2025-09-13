
/*
Q.18) Find largest sum contigeous sub array
Given an array Arr[] of N integers. Find the contiguous sub-array(containing at least one number) which has the maximum sum and return its sum.

Example 1:
Input:
N = 5
Arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:
Input:
N = 4
Arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)
*/
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        // int[] arr = { 1, 2, 3, -2, 5 };
        int[] arr = new int[n];
        System.out.println("Enter elements (0s and 1s only):");
        for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
        }
        int max = 0;

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                int temp = 0;
                sum += arr[j];
                if (max < sum) {
                    max = sum;
                }

            }

        }
        System.out.println(max);

    }

}