//    4) WAP to print table of a number.
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. to print the table");
        int n = sc.nextInt();
        int i =0 ;
        while(i<n){
            System.out.println(n+"x"+i+" " +(n*i));
            i++;
            
        }
        
    }
}