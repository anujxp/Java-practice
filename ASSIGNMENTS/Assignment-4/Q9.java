// 9) WAP to print N even numbers.
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int n  = sc.nextInt();
        int i = 1;

        while(i<=n){
            System.out.println(i*2);
            i++;

        }
sc.close();


    }
}

