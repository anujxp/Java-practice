// W.A.P to check whether the traingle is equilateral, scalene, or isosceles. Hint: - Isosceles triangle: In geometry, an isosceles triangle is a triangle that has two sides of equal length. Equilateral triangle: In geometry, an equilateral triangle is a triangle in which all three sides are equal. Scalene triangle: A scalene triangle is a triangle that has three unequal sides. 
import java.util.Scanner;

class Test{
    public static void main(String args[]){
         Scanner sc = new Scanner(System.in);

         System.out.println("Enter  first side of a triangle");
         double a= sc.nextDouble();
         System.out.println("Enter  second sides of a triangle");
         double b = sc.nextDouble();
         System.out.println("Enter  third sides of a triangle");
         double c = sc.nextDouble();

         
        if ((a + b > c && a + c > b && b + c > a) && (a >= 0 && b >= 0 && c >= 0)) {
            if (a == b && b == c) {
                System.out.println("It is an Equilateral triangle.");
            } else if (a == b || b == c || a == c) {
                System.out.println("It is an Isosceles triangle.");
            } else {
                System.out.println("It is a Scalene triangle.");
            }
        } else {
            System.out.println("Invalid triangle sides.");
        }
         

        sc.close();
         
    }
}