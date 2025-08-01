import java.util.Scanner;

class Q17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of rectangle: ");
        double length = sc.nextDouble();

        System.out.print("Enter the breadth of rectangle: ");
        double breadth = sc.nextDouble();
        // logic
        double area = length * breadth;
        // print area
        System.out.println("The area of rectangle is "+ area);

        sc.close();

    }
}