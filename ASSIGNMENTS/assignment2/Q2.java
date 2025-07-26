// The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
import java.util.Scanner;
 
class Test {
    public static void main(String[] args) {
        int area = 96;

        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the breadth of the rectangle ");
        int b = sc.nextInt();
        int length = area/b;
        int perimeter = 2* (length + b);
        System.out.println("length : "+ length );
        System.out.println("perimeter:"+ perimeter);

        
        
        
    }
    
}
