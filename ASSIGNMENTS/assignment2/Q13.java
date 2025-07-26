import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the area");
        int area = sc.nextInt();
        System.out.println(" Enter the side which is given ");
        int s1 = sc.nextInt();
        int s2 = (2* area )/s1;
        System.out.println(" the other leg is : "+ s2);
        

    }
    
}
