    // 13) WAP to print N natural numbers in reverse order
    import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter a number to print n netural number in reverse order");
        int n = sc.nextInt();
        int i = n;
        if(n%2==0);
        else
        n=n-1;
        while(i>0){
            System.out.println(i*2);
            i-- ;


        }
sc.close();


    }
    
}
