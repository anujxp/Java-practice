// What will be the area of a square with perimeter 200 m?

import java.util.Scanner;

public class Q31 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter perimeter of sqaure: ");
        int per  = sc.nextInt();
        int side = per/4;
        int area = side*side;
        System.out.println("area of the sqaure is "+area);

    }
}
