// The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        int perimeter = 230;
        int l ;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter length of rectanle");
        l = sc.nextInt();
        int b = perimeter/2 - l;
        int area = l*b;
        System.out.println(area);


    }
}