// If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.

import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int tcost = 1600;
        int rate = 25;
        int area = tcost/rate;
        System.out.println("Please Enter a length :");
        int l = sc.nextInt();
        int breadth = area/l;
        System.out.println("bradth: "+breadth);
        System.out.println("perimeter :"+ 2*(l+ breadth));

    }
}