// *****
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("*");
        }
    }
}