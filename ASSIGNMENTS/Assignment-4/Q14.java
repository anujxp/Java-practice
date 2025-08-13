// 14) WAP to print alphabets in uppercase
class Test {
    public static void main(String[] args) {
        char n = (char) ('A' - 1);
        while (n != ('Z')) {
            System.out.print((char) (n + 1) + " ");
            n++;
        }
    }

}
