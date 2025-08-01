// W.A.P to check the sign of given number
import java.util.Scanner;

class Test{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter any number to check the sign");
    int number = sc.nextInt();
    
    if(number <0)
    System.out.println("sing = -");
    else if(number>0 )
    System.out.println("sign = +");
    else 
    System.out.println("nutral there is no sign");


        sc.close();

    }
    
}