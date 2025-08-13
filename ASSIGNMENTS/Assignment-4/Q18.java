// 18) 1	2	2	4	8	32	…… n terms
import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no. of term to print series");
        long n = sc.nextInt();
        long f = 1,i = 1;
        System.out.println(f);
        long firstno = 1;
        long secondno =2;


        while(i<=n){
            f = firstno*secondno;
            System.out.println(f);
            firstno = secondno;
            secondno = f;
            i++;
        }


    }
}