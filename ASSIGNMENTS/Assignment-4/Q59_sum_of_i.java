// import java.util.Scanner;
class Test{
    public static void main(String[] args) {
    // Scanner se = new Scanner(System.in);
        int i = 100;
        int sum = 0;

        while(i<= 200)
        {
            if(i % 9 == 0){
                System.out.println(i);
                sum += i;
            }

            i++;
        }
        System.out.println(sum);
        

    
}
}