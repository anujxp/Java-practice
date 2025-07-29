// How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?

import java.util.Scanner;

public class Q30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of bed: ");
        int dl  = sc.nextInt();
        System.out.println("Enter width of  bed ");
        int dw = sc.nextInt();
        int areaf = dl *dw;
        System.out.println("Enter length of tile: ");
        int tl  = sc.nextInt();
        System.out.println("Enter width of  tile");
        int tw = sc.nextInt();
        int areat = tl *tw;
        System.out.println("tile required:"+ areaf/areat);
    }
}