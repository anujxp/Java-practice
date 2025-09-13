import java.util.Arrays;

class LongestConsecutive {
    public static void main(String[] args) {
        int[] arr = {2, 6, 1, 9, 4, 5, 3};
        int n = arr.length;

        Arrays.sort(arr);

        int maxLen = 1, currLen = 1;

        for (int i = 1; i < n; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                currLen++;  // consecutive
            } else if (arr[i] != arr[i - 1]) {
                currLen = 1;  // reset (skip duplicates)
            }
            maxLen = Math.max(maxLen, currLen);
        }
        System.out.println("Length of longest consecutive subsequence = " + maxLen);
    }
}