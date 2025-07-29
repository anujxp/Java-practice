// How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length of brick in cm: ");
        int bl  = sc.nextInt();
        System.out.println("Enter width of brick in cm  ");
        int bw= sc.nextInt();
        int areab = bl*bw;
        
        System.out.println(" Enter the length of path in cm ");
        int pl = sc.nextInt();
        System.out.println(" Enter the width of path in cm ");
        int pw = sc.nextInt();
        int areap = pl* pw;
        System.out.println("No. of brick that are required "+ (areap/areab));
        

    }
    
}
