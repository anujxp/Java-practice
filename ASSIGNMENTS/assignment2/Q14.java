// The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.
import java.util.Scanner;

public class Q14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter diagonal:");
        int diagonal = sc.nextInt();
        System.out.println(" Enter height :");
        int height = sc.nextInt();
        System.out.println("enter another height :");
        int heightl = sc.nextInt();
        double area = 0.5 * diagonal* (height* heightl);
        System.out.println(" area of the quadrilateral :"+ area);
        

    }
}