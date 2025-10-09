// *****
// *  *
// * *
// **
// *
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();
        // by using decreasing loop

        for (int i = n; i >0; i--) {
            for (int j = i; j >0 ; j--)  {
                if (i == n || j == i || j==1)
                    System.out.print(i);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        //by using increasin loop
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i ; j++)  {
                if (i==0|| j== 0|| j== n-i-1)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        se.close();
    }
}