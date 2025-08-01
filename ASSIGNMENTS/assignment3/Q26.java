// Find even odd using switch case 
import java.util.Scanner;

public class Q26 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number to check wheter it is odd or even");
        int n = sc.nextInt();

        int check = n%2;

        switch (check) {
            case 0:
                System.out.println("even");
                break;
            case 1:
                System.out.println("odd");
                break;
        
            default:
                System.out.println("sorry technical error....");
                break;
        }

        sc.close();      
    }
}
