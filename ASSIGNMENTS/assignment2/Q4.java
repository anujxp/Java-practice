// Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        int l, b ;
        System.out.println("Enter length and breadth of the plot :");
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        b = sc.nextInt();
        int area = l* b ;
        int cost = area/100*6;
        System.out.println(area);
        System.out.println("cost for tiling "+cost);
        
        

    }
}