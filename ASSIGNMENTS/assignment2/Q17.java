// Luci is making a display board for the school exhibition. The display board is a 3 m by 2 m rectangle. He needs to add a ribbon border around the entire display board. What is the length of ribbon that he needs?

import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("please Enter length of display board");
        int l = sc.nextInt();
        System.out.println("Enter breadth of display board:");
        int b = sc.nextInt();
        int perimeter = 2* ( l+b);
        System.out.println("he need "+ perimeter + " carpet ribbon");

    }
    
}
