import java.util.Scanner;

class Test  {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number to print serise and number");
    int n = sc.nextInt();
    System.out.println();

    int i =1;
    double sum = 0;

    while(i<=n)
    {
        System.out.println("1/"+i);
        sum += (double)1/i;
        i++;
    }
    System.out.println(sum);
}    
}
