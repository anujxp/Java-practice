// WAP to check given year is a leap year or not 
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter year to be check :");
        int year = sc.nextInt();

        if((year%4 ==0  && year % 100 != 0)||(year % 400 == 0))
        System.out.println("The given year is a leap year");
        else 
        System.out.println("The given year is not a leap year:");

        sc.close();
         
}
}