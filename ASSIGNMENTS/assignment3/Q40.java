// Write a Java program to calculate profit or loss. 
import java.util.Scanner;
public class Q40 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Enter margin");
        int margin = sc.nextInt();
        System.out.println("Enter total amount ");
        int totalamt = sc.nextInt();

        if(margin>0){
            double profit = (double)((totalamt-margin)/(double)margin * 100);
            System.out.println("your total profit is :"+(totalamt- margin));
            System.out.println("Profit in percentage :" + profit + "%");

            
        }



        sc.close();

    }
    
}
