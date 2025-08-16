    // 60) WAP to print Square, Cube and Square Root of all numbers from 1 to N
import java.util.Scanner;
class Test {
public static void main(String[] args) {
    Scanner se = new Scanner(System.in);
    System.out.println("Enter no. of term to print square  cube sqrt ");
    int n = se.nextInt();
    int i =1 ;
    System.out.println("number\tsquare\tcube \tsqrt");
    while(i<=n){
        System.out.println(i + "\t"+i*i + "\t" + i*i*i + "\t" + Math.sqrt(i));
        i++;
    }
se.close();
}
}
    

