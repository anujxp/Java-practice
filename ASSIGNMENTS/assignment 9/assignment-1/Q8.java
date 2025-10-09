// 8) WAP to find out total occurrence of each letter in string.
// 	 Sample Input: “aabbccddd”
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times

class Occurence {
    public void ocr(String str) {
        boolean[] visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            if (visited[i])
                continue;

            int count = 1; // 
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    count++;
                    visited[j] = true;
                }
            }
            System.out.println(str.charAt(i) + " - " + count + " times");
        }
    }
}

class Test {
    public static void main(String[] args) {
        String str = "aabbccddd";
        Occurence ocr = new Occurence();
        ocr.ocr(str);
    }
}
