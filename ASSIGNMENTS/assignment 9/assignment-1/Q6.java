// 6) Write a java program to find all possible palindrom of given String.
// Sample Input: “aaabbbacccababacccaabb”

class test{
    public static boolean e(String str, String s) {
    if (str.length() != s.length()) {
        return false;
    }
    for (int i = 0; i < s.length(); i++) {
        if (str.charAt(i) != s.charAt(i)) {
            return false;
        }
    }
    return true;
}

    public static void main(String[] args) {
        String str = "aaabbbacccababacccaabb";
        int length = str.length();
        String s = "";


        for (int i = length-1; i>0; i--) {
            s+= str.charAt(i);
        }
        if(e(str,s))
        System.out.println("String is Palindore");
        else
        System.out.println("String is not Palindore");

    }   
}
