// WAP to find word of maximum length in given String.
// 	Sample Input: “Dear Student ,You have need to work hard”
// `	Output: “Student”class Test{
class main {
    public static void main(String[] args) {
        String str = "Dear Student ,You have need to work hard";
        int length = str.length();
        String s = "";
        int start = 0;
        int maxlen = 0;
        for (int i = 0; i <= str.length(); i++) {
            if (i == length || str.charAt(i) == ' ') {
                if (i - start > maxlen) {
                    s = "";
                    maxlen = i - start;
                    for (int j = start; j < i; j++) {
                        s += str.charAt(j);
                        for (int j = start; j < i; j++) {

                        }
                    }
                    start = i + 1;
                }
            }
            System.out.println(s);

        }
    }
}