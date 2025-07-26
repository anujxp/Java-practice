// Find the height of a triangle whose base is 50 cm and whose area is 500 cm².
import java.util.Scanner;

public class Q7 {

    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int area,base, height;
                System.out.println(" please Enter area:");
                area = sc.nextInt();
                System.out.println("Enter base:");
                base = sc.nextInt();
                height = (area*2)/base;
                System.out.println(height);
    }
}