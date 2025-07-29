// A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.
import java.util.Scanner;

public class Q28{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of carpet : ");
        int dl  = sc.nextInt();
        System.out.println("Enter width of carpet:");
        int dw = sc.nextInt();

        int area = dl*dw;

        System.out.println("Enter cost rate per meter sqaure  in $");
        int cr = sc.nextInt();
        int cost = area * cr;
        System.out.println(" total cost for tiling the dining room "+ cost+"$");

    }
}
