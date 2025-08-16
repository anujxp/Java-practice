    // 31) 9	99	999	9999	  99999 …….
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int num = 0;
        System.out.println("the series is:");

        int i = 1;
        while(i <= n){
            num = num*10+9;
            System.out.println(num);
            i++;
        }
    }
}