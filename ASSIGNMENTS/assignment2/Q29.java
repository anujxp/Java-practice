// How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of floor : ");
        int dl  = sc.nextInt();
        System.out.println("Enter width of  floor ");
        int dw = sc.nextInt();
        int areaf = dl *dw;

        System.out.println("Enter side of square");
        int side = sc.nextInt();
        int areas = side*side;
        System.out.println("need of the tile area required"+ areaf/areas);
        
        
        

    }
}
