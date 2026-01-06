// Input: s = "abba"
//     Output: 1
//     Explanation: s is a palindrome

class Test{
    static boolean isPalindrome(String str ){
        int i = 0;
        int j = str.length()-1;
        while (i<j) {
            if(str.charAt(i)==str.charAt(j)){
                i++;
                j--;
            }else 
            return false;
        }
    return true;
    }
    public static void main(String[] args) {
        String s = "abbaa";
        if(isPalindrome(s))
        System.out.println("String is palindrome");
        else 
        System.out.println("Given String is not a palindrome");
    }
}