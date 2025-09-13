/*Q.21 Max Sum in configuration

Given an array(0-based indexing), you have to find the max sum of i*A[i] where A[i] is the element at index i in the array.The only operation allowed is to rotate(clock-wise or counter clock-wise) the array any number of times.
Example 1:
Input:
N = 4
A[] = {8,3,1,2}
Output: 29
Explanation: Above the configuration
possible by rotating elements are
3 1 2 8 here sum is 3*0+1*1+2*2+8*3 = 29
1 2 8 3 here sum is 1*0+2*1+8*2+3*3 = 27
2 8 3 1 here sum is 2*0+8*1+3*2+1*3 = 17
8 3 1 2 here sum is 8*0+3*1+1*2+2*3 = 11
Here the max sum is 29*/
class MaxSumConfiguration {
    public static void main(String[] args) {
        int arr[] = {8, 3, 1, 2};
        int n = arr.length;

        int maxSum = Integer.MIN_VALUE;

        // Try all rotations
        for (int r = 0; r < n; r++) {
            int sum = 0;
            // calculate current sum
            for (int i = 0; i < n; i++) {
                sum += i * arr[i];
            }

            if (sum > maxSum) {
                maxSum = sum;
            }

            // rotate array by 1 (clockwise)
            int last = arr[n - 1];
            for (int i = n - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = last;
        }

        System.out.println("Maximum sum = " + maxSum);
    }
}
