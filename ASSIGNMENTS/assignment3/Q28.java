// Program to perform arithmetic operation using switch case
import java.util.Scanner;

public class Q28 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter operand to perform arithmatic operation");
        double a = sc.nextDouble();
        double b = sc.nextDouble();

        System.out.println("Enter operator to perform operation\n + for Addition\n- for substraction \n* star for multiplication\n / for devidation");
        char operator = sc.next().charAt(0);
        
        switch (operator) {
            case '+':System.out.println(a + b);break;
            case '-':System.out.println(a - b);break;
            case '*':System.out.println(a * b);break;
            case '/':System.out.println(a / b);break;
            default:System.out.println("you have Enter wrong operator");break;
        }

        sc.close();
    }
    
}
