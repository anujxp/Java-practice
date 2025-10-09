
// ABCDE
// ABCD
// ABC
// AB
// A
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        char n = (char) (64 + se.nextByte());

        for (char i = n; i >= 'A'; i--) {
            for (char j = 'A'; j <= i; j++) {
                if (j <= i)
                    System.out.print(j);
            }
            System.out.println();
        }
    }
}