// A rectangular garden has dimensions of 30 m by 20 m and is divided in to 4 parts by two pathways that run perpendicular from its sides. One pathway has a width of 3 m and the other, 4 m. Calculate the total usable area of the garden.

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter length of garden :");
        int lg = sc.nextInt();
        System.out.println("Enter width of garden");
        int wg = sc.nextInt();
        
        System.out.println("Wnter first path width :");
        int p1 = sc.nextInt();
        System.out.println("Wnter 2nd path width :");
        int p2 = sc.nextInt();
        int areag = ((lg-p1)*(wg-p2));
        int parea = p1*p2;
        System.out.println(" total area which occupied by garden"+(areag-parea));
        System.out.println(16*27);
        
        

    }
    
}
