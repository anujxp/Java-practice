
// 36) WAP to reverse a number
import java.util.Scanner;

class Test {
    public static void main(String... args) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter a number to reverse");
        int n = se.nextInt();
        int rem = 0, rev= 0;
        
        while (n != 0) {
            rem = n% 10;
            rev = rev*10 + rem;
            n = n/10;           
        }
        System.out.println(rev);
        
    }

}
