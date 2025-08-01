// A company decided to give bonus of 5% to employee if his/her year of service is more than 5 years.
// Ask user for their salary and year of service and print the net bonus amount.
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary");
        int salary = sc.nextInt();
        
        System.out.println(" Enter your service year :");
        double  serviceYear = sc.nextDouble();
        
        
        if(serviceYear<= 5)
            System.out.println(" sorry you are not eligible for bonus \nyour salary is :"+ salary);
        else
            System.out.println(" congratulation you are eligible for 5% bonus\nsalary: "+(salary*1.05));
    
        

        sc.close();
        
    }
    
}
