// A square garden with a side length of 150 m has a square swimming pool in the very centre with a side length of 25 m . Calculate the area of the garden.

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length  of sqaure: garden");
        int l  = sc.nextInt();
        int area = l*l;
        System.out.println("Enter the side length of side of swimming pool");
        int ls = sc.nextInt();
        int areas = ls*ls;
        int tarea = area-areas;
        System.out.println("area  of the garden is " + tarea);
    
        
        
    }
}
