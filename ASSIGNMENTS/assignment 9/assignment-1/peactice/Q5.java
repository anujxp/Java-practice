import java.util.Scanner;

class Str {
    private String s;

    public Str(String str) {
        this.s = str;
        System.out.println(this.s);
    }

    public String reverse(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public String reversestr() {
        String rev = "";
        int start = 0;
        int length = this.s.length();
        for (int i = 0; i < length; i++) {
            String parse = "";
            if (i == length - 1 || this.s.charAt(i) == ' ') {
                for (int j = start; j <= i; j++) {
                    parse += this.s.charAt(j);
                }
                rev += reverse(parse);
                if (i != length - 1)
                    rev += " ";
                start = i + 1;
            }
        }
        return rev;
    }

}

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a full sentence: ");
        String str = sc.nextLine();

        Str s1 = new Str(str);
        
        System.out.println(s1.reversestr());
        System.out.println();

    }
}
