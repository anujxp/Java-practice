//11 WAP to print N odd numbers.
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n  = sc.nextInt();
        int i = 1;
        System.out.println(i);
        while( i <= n){
            System.out.println(i*2 -1);
            i++ ;
        }
        sc.close();

    }
}