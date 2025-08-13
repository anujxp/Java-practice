// 8) WAP to print Fibonacci series.
import java.util.Scanner;


class Test{
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to print fibonacci series");

        int n = sc.nextInt();

        int f =0 ,t1 = 0,t2=1, i =0;
        System.out.println(t1 + "\n" + t2);

        while(i<n-2){
            f = t1 + t2;
            System.out.println(f);
            t1 = t2;
            t2 = f;
            i++;
        }

sc.close();

    }

}