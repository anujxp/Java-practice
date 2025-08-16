// 41) WAP to find out LCM of a number
import java.util.Scanner;

class Test{
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);

        int i, n, m,  lcm;
        
        System.out.print("Enter first number : ");
        n = sc.nextInt();
        System.out.print("Enter second number : ");
        m = sc.nextInt();
        i = n > m ? n : m;
        while(true){
            if(i % n == 0 && i % m == 0){
                lcm = i;
                break;
            }
            i++;
        }
        System.out.println("LCM of " + n + " and " + m + " is " + lcm);
        sc.close();
    }
}