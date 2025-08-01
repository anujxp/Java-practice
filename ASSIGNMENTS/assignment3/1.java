// Take values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" please Enter the length and breadth");
        int l = sc.nextInt();
        int b = sc.nextInt();
        if(l==b)
        System.out.println("yes it is a sqaure");
        else 
        System.out.println(" It is not a square");

        sc.close();
        
    }
}