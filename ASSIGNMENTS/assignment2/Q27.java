// Find the cost of tiling a dining room 20 m long and 15 m wide at the rate of $ 5 per square m.

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length dinnning room: ");
        int dl  = sc.nextInt();
        System.out.println("Enter width of dinning room ");
        int dw = sc.nextInt();

        int area = dl*dw;

        System.out.println("Enter cost rate per meter sqaure ");
        int cr = sc.nextInt();
        int cost = area * cr;
        System.out.println(" total cost for tiling the dining room "+ cost);

    }
}
