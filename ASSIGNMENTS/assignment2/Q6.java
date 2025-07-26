// Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.

import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int perimeter = 36;
        System.out.println("Please Enter two side ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = perimeter - a -b ;
        int s = (a+b+c)/2;
        int sq = (s*(s-a)*(s-b)*(s-c));
        float area = (float)(Math.sqrt(sq));
        System.out.println("area of triangle  is "+area);

        
    }
    
}
