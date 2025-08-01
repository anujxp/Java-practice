// Java program to check whether the triangle is valid or not if angles are given. Hint:- The angle property of the triangle says that the sum of all three angles should be equal to 180. 
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter  first angle of a triangle");
         double a= sc.nextDouble();
         System.out.println("Enter  second angle of a triangle");
         double b = sc.nextDouble();
         System.out.println("Enter  third angle of a triangle");
         double c = sc.nextDouble();

         if((a+b+c)==180.0)
         System.out.println("Triangle is valid ");
         else 
         System.out.println("Triangle is no valid ");


        sc.close();

    }
}