// A B C D E
//  A B C D
//   A B C
//    A B
//     A

import java.util.Scanner;

class Test{
    public static void main(String... args) {
        System.out.println("Enter rows :");
        Scanner se = new Scanner(System.in);
        int rows = se.nextInt();
        
        for(int i = 0; i< rows;i++){
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < rows-i; k++) {
                System.out.print((char)('A'+k) +" ");
            }
            System.out.println();
        }
    }
}