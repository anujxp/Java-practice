// WAP to exchange value to two variable with third variable and without third variable
import java.util.Scanner;

class Q19{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();
       
        System.out.println("Enter the second number: ");
        int b = sc.nextInt();
    //    before swap
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);
        // swapping
        int temp = a;
        a = b;
        b = temp;
    //    after swapping
        System.out.println("Value of a is : " + a);
        System.out.println("Value of b is : " + b);

        sc.close();

    }
}