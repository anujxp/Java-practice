
// 48) WAP to find out the factors of all the numbers between two entered numbers
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter  2 number to check b/w elments factor");
        int n1 = se.nextInt();
        int n2 = se.nextInt();
        if (n1 < n2) {
            while (n1 <= n2) {
                int i = 1;
                System.out.print(" factor of " + n1 + " is :");
                while (i <= n1) {
                    if (n1 % i == 0)
                        System.out.print(" " + i);
                    i++;
                }
                n1++;
                System.out.println();
            }
        }
        se.close();
    }
}
