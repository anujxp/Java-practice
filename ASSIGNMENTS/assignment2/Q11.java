// The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the tr

import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter area ");
        int area = sc.nextInt();

        System.out.println("Enter ratio");

        int baseRatio = sc.nextInt();
        int heightRatio = sc.nextInt();
        double y = area /((0.5)* heightRatio*baseRatio);
        int x = (int) Math.sqrt(y);
        int height = heightRatio* x;
        int base = baseRatio* x;
        System.out.println("height : "+ height);
        System.out.println(" base : "+ base);

        
        
        
    }
}
