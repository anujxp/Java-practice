// 8) WAP to find out total occurrence of each letter in string.
// 	 Sample Input: “aabbccddd”
// 	 Output:   a- 2 times
// 			b- 2 times
// 			c- 2 times
// 			d- 3 times

class Count {
    public void count(String str) {
        int n = str.length();
        boolean[] isvisited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (isvisited[i] == true) {
                continue;
            }
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isvisited[j] = true;
                    count++;
                }
            }
            if (!isvisited[i])
                System.out.println("Occurence of " + str.charAt(i) + " is : " + count);

        }
    }
}

class Main {
    public static void main(String[] args) {
        Count c1 = new Count();
        c1.count("aabbccddd");
    }
}
