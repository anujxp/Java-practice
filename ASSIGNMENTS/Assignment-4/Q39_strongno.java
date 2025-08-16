// 39) WAP to check whether entered number is strong or 
import java.util.Scanner;
class Test{
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = se.nextInt();
        int sum = 0;
        int temp = num;
        while(num>0){
            int rem = num%10;
            int fact = 1;
            for(int i=1;i<=rem;i++){
                fact = fact*i;
            }
            sum += fact;
            num = num/10;
        }
        if(sum == temp)
            System.out.println(temp + " is a strong number");
        else
            System.out.println(temp + " is not a strong number");
            
        

        
    }
    
}
