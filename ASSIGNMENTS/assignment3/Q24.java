// WAP to check wheater number is positive or negative
import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number ");
        int n = sc.nextInt();

        if(n<0 )
        System.out.println("Entered number is -ve");
        else if(n>0 )
        System.out.println("Entered number is possitive ");
        else
        System.out.println("number is not negetive neigther positive");

        sc.close();


    }

    
}
