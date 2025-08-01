// WAP to find lowest number among four different number 
import java.util.Scanner;
 class Q29 {
    public static void main(String args[]){
         Scanner sc  = new Scanner(System.in);

        System.out.println("Enter four no. to check lowest");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();

        int smallest = n1;

        if(n2<smallest)
        smallest = n2;
               
        if(n3<smallest)
        smallest = n3;
               
        if(n4<smallest)
        smallest = n3;

        System.out.println("the lowest no. is "+ smallest); 
        
        sc.close();
        
        
        }
    
}
