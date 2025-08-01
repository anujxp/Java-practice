// // WAP to find greater among two number 
// import java.util.Scanner;

// public class Q6{
// public static void main(String[] args) {
//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter two no.");
//     int n1 = sc.nextInt();
//     int n2 = sc.nextInt();
//     // logic 
    
//     if (n1<n2)
//         System.out.println(n2+"is greater");
//     else if(n1>n2)
//         System.out.println(n1 + "is greater");
//     else
//         System.out.println("both are equal");
    
//     }
// }

/* 6. Print absolute value of number entered by user.
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int num = sc.nextInt();

        if(num < 0) {
            num = -num;
        }
        System.out.println("Absolute value is: " + num);

        sc.close();
    }
}