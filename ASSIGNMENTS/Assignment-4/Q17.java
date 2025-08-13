 // 17) 1 	2	 4	 7	 11	 16 	…… n terms
 import java.util.Scanner;
 
class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter term no. to this");
        int n = sc.nextInt();
        
        int term = 1, i = 1 ;
        while(i<= n)
        {
            System.out.println(term + " ");
            term +=i;
            i++;

        }
        sc.close();

    }
    
}
