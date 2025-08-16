// 40) WAP to count no. Of even and odd digits in a number
import java.util.Scanner;
class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = se.nextInt();
        int even = 0, odd = 0;
        while (n!= 0){
            int digit = n % 10;
            if (digit % 2 == 0){
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }
        System.out.println("No. of even digits: " + even);
        System.out.println("No. of odd digits: " + odd);
        }
    
}    

