// 20) 0	7	14	21	28	35	…..
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter a number to print series: ");
        int n = se.nextInt();
        
        int i = 0 ;
        while(i<n)
        {
            System.out.println(i*7);
            i++;

        }
    }
    
}
