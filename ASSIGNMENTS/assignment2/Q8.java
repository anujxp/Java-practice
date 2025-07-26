// Find the base of a triangle whose altitude is 20 cm and area is 0.8 m².

import java.util.Scanner;

public class Q8 {
public static void main(String[] args) {
    int area = (int)(0.8*10000);
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter height ");
    int h = sc.nextInt();
    int base  = (area*2)/h;
    System.out.println("base :"+ base );
    
}
}