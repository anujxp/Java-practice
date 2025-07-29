// Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.

import java.util.Scanner;

public class Q35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter radius of cylender");
        int radius = sc.nextInt();
        System.out.println(" Enter radius of");
        int height = sc.nextInt();
        double area = 2*Math.PI*radius*(radius+ height);

        
        sc.close();
        
    }
    
}
