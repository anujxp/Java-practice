// iFind the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.

import java.util.Scanner;



public class Q12 {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println(" Enter hypotenuse");
                double  h  = sc.nextDouble();
                double  s  = sc.nextDouble();
                double otherleg = Math.sqrt((h*h)- (s*s));
                System.out.println(" size of the other leg is : "+ otherleg);

                

    }
}