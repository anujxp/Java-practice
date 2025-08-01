// Write a Java program to check whether a number is divisible by 5 and 11 or not. 
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number ");
        int n = sc.nextInt();
        
        if(n%5 == 0 && n%11==0)
            System.out.println("number is divisible by 5 And 11");
        else
            System.out.println("number is not divisible by 5 And 11");


        sc.close();

    }
}