// 7)WAP to remove the duplicate letters from given String.
// 	Sample Input: “aabbccddd”
// 	Output: “abcd”
class test {
    public static void main(String[] args) {
        String str = "aabbccddd";
        // String s = "";
        StringBuilder s = new StringBuilder();


        for (int i = 0; i < str.length(); i++) {
            boolean found = false;
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == str.charAt(i)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                // s += str.charAt(i);
                s.append(str.charAt(i));
            }
        }
        System.out.println(s.toString());
    }
}
