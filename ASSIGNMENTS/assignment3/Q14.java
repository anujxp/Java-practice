/* 14. 14.Write a program to accept percantage from the user and
display grade according to the following criteria
  Marks	  		Grade
  > 90       		 A
  >80 and <=90		 B
  >=60 and <=80		 C
  below 60		 D
*/

import java.util.Scanner;

class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter percentage: ");
        int p = sc.nextInt();

        if(p > 90) {
            System.out.println("Grade A");
        } else if(p > 80 && p <= 90) {
            System.out.println("Grade B");
        } else if(p >= 60 && p <= 80) {
            System.out.println("Grade C");
        } else {
            System.out.println("Grade D");
        }
        sc.close();

    }
}