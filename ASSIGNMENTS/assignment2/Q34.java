// A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.

import java.util.Scanner;

public class Q34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter BASES :");
        int b1 = sc.nextInt();
        int b2 = sc.nextInt();
        System.out.println("Enter height ");
        int h = sc.nextInt();
        int areat = (b1+b2)*h/2;
        System.out.println("Enter walkway width:");
        int w = sc.nextInt();
        int walkway =w*h;
        int areaf = areat - walkway;
        System.out.println("final area is "+ areaf);

        
        
    }
    
}
