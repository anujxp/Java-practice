// A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
// Ask user for quantity
    // Suppose, one unit will cost 100.
    // Judge and print total cost for user.
import java.util.Scanner;
class Test{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println(" Enter the quantity ");
        int q = sc.nextInt();
        int cost = q*100;
        
        if(cost<=1000)
            System.out.println("your cost is "+ cost);
        else
        System.out.println("You have to pay \n"+cost +" \n-10% of discount\nfinal amount:"+ (cost*0.9));
        
        sc.close();

    }
}