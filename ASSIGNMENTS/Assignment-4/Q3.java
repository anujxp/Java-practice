    // 2) WAP to print sum of N natural number.  
import java.util.Scanner;
class Test {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print series")
        int n = sc.nextInt();
        int sum =0;
        for(int i =0;i<n;i++){
            sum += i;
        }
        System.out.println(sum);
    }
}
