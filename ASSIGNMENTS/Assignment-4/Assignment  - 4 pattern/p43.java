//     1
//    12
//   123
//  1234
// 12345

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter row");
        int n = se.nextInt();

        for (int i = 0; i < n; i++) {
            int k = 1;
            for (int j = 0; j <n; j++) {
                if (j>=n-i-1){
                    System.out.print(i);
                    k++;
                }
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}