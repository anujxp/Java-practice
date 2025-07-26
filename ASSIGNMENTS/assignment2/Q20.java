// What is the volume of a brick of ice-cream with length 25 cm, breadth 10 cm and height 8 cm?

import java.util.Scanner;

class Q20 {
    public static void main(String agrs[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of the cuboid : ");
        int length = sc.nextInt();
        System.out.println("Enter the breadth of the cuboid : ");
        int breadth = sc.nextInt();
        System.out.println("Enter the height of the cuboid : ");
        int height = sc.nextInt();
        int vol = length * breadth * height;
        System.out.println("Enter the side of cube ");
        int side = sc.nextInt();
        int cubevol = side * side * side;
        String result = (vol > cubevol) ? " cuboid is greater" : "cube is greater";
        System.out.println(result);

    }
}