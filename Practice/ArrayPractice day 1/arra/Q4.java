// 4:    Input: s = "GeeksforGeeks"
// Output: "skeeGrofskeeG"
// Explanation : The first character G moves to last position, the second character e moves to second-last and so on.

class Main{
     public static String reverseStringManually(String s) {
        char[] charArray = s.toCharArray();

        int left = 0;
        int right = charArray.length-1 ;
        while (left<right) {
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
         return new String(charArray);
     }

    public static void main(String[] args) {
        String s = "GeeksforGeeks";
        String reversed = reverseStringManually(s);
        System.out.println("Input:  \"" + s + "\"");
        System.out.println("Output: \"" + reversed + "\""); // "skeeGrofskeeG"
    }
}