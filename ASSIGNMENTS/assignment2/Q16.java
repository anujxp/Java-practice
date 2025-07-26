
// Tina wants a new carpet for her rectangular dining room. Her dining room is a 5 meters by 7 meters rectangle. How much carpet does she need to buy to cover her entire dining room.

import java.util.Scanner;

 public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter length of dining room");
        int l = sc.nextInt();
        System.out.println("eNTER THE breadth of dinning room:");
        int b = sc.nextInt();
        int area = l*b ;
        System.out.println("she need "+ area + " caroet to cover it");

        
    }
    
}
