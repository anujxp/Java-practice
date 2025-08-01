// Bitwise ^ operator
// 5. WAP to exchange value of two variable without using third variable and arithmetic operatorimport java.util.Scanner;
import java.util.Scanner;
class Q20{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
        
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
        
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        
        sc.close();
        
    }
}