// Q.17 Find it there is any subarray with sum equals to zero
// Given an array of positive and negative numbers. Find if there is a subarray (of size at-least one) with 0 sum.
// Example 1:
// Input:
// 5
// 4 2 -3 1 6

// Output: 
// Yes

// Explanation: 
// 2, -3, 1 is the subarray 
// with sum 0.
// Example 2:
// Input:
// 5
// 4 2 0 1 6

// Output: 
// Yes

// Explanation: 
// 0 is one of the element 
// in the array so there exist a 
// subarray with sum 0.
class Test {
    public static void main(String[] args) {
        int[] arr = {4, 2, -3, 1, 6};
        int n = arr.length;
        boolean found = false;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum == 0) {
                    found = true;
                    System.out.println("Subarray with 0 sum found between index " + i + " and " + j);
                    break;
                }
            }
            if (found) break;
        }

        if (!found) {
            System.out.println("No subarray with 0 sum found");
        }
    }
}
