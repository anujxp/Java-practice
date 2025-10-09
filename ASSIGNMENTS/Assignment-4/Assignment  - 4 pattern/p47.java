
//     1
//    11
//   1*1
//  1**1
// 11111
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();

        for (int i = 0; i < n; i++) {
            for(int j = 0;j< n-i;j++)
            System.out.print(" ");

            for (int k = 0; k <=i; k++) {
                if(k==0|| k==i||i==n-1)
                System.out.print("1");
                else
                System.out.print("*");
                
            }
            System.out.println();
        }

        se.close();
    }
}