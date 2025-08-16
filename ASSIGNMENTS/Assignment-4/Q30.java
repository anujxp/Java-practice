    // 30) 1+11+111+1111+11111+…. 
        
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int num = 0;
        System.out.println("the series is:");

        int i = 1;
        int sum = 0;
        while(i <= n){
            num = num*10+1;
            System.out.println(num);
            sum+=num;
            i++;
        }
        System.out.println(sum);
sc.close();    
}
}
