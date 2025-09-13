
// 5. Multiple Catch Blocks
// 
// 👉 Take two integers and perform division. Handle both ArithmeticException and InputMismatchException separately.
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Enter a number ");
            int a = sc.nextInt();
            System.out.println("Enter 2nd number");
            int b = sc.nextInt();
            System.out.println("divicde = "+a / b);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }catch(InputMismatchException e ){
            e.printStackTrace();
        }

    }
}