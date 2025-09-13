import java.util.InputMismatchException;
import java.util.Scanner;
class Exc{
    private int a;
    private int b ;
    public void input(){
        Scanner sc = new Scanner(System.in);
        try{
        a = sc.nextInt();
        b = sc.nextInt();
        
        }catch(InputMismatchException e){
            System.out.println("You have entered wrong type of data. Please enter integers only.");
            sc.next(); // clear the invalid input from buffer
            System.out.println("enter again ");
             b = sc.nextInt();
        }
        finally{
            // sc.close();
            System.out.println("finally");
        }
    }
    public void divide(){
        try{
            System.out.println(a/b);
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
    }
}
class Main{
    public static void main(String[] args) {
        
        Exc e1 = new Exc();
        e1.input();
        e1.divide();
    }


    
}