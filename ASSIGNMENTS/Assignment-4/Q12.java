    // 12) WAP to print Odd numbers upto N.

import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println(" Enter a number ");
        int n = sc.nextInt();
        int i = 1;
        // System.out.println(i);
        while(i <= n){
            System.out.println(i);
            i+=2;
            

        }
sc.close();
        
    }
    
}
