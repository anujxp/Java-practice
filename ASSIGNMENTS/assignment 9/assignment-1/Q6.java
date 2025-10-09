// 6) Write a java program to find all possible palindrom of given String.
// Sample Input: “aaabbbacccababacccaabb”
class AllPalindromes {
    
    // Method to check if a substring is palindrome
    static boolean isPalindrome(char[] arr, int start, int end) {
        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "aaabbbacccababacccaabb";
        char[] arr = str.toCharArray();

        int n = arr.length;

        System.out.println("All possible palindromes are:");

        // Generate all substrings
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Check if substring arr[i..j] is palindrome
                if (isPalindrome(arr, i, j)) {
                    // Print manually (without substring function)
                    for (int k = i; k <= j; k++) {
                        System.out.print(arr[k]);
                    }
                    System.out.println();
                }
            }
        }
    }
}

