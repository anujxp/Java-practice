// 100 bricks of length 24 cm and breadth 15 cm are used to tile a path of a garden. What is the area of the path?

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter theLlegth of brick  : ");
        int wl = sc.nextInt();
        System.out.println("Enter the width fo brick: ");
        int wb = sc.nextInt();
        System.out.println(" enter the number of brick ");
        int nob = sc.nextInt();
        int area = wl * wb* nob;
        System.out.println(" area of the path :"+ area);
        
    }
    
}
