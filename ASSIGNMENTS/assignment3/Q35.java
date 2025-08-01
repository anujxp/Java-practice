//W.A.P to check whether a charachter is an alphabet or not.
import java.util.Scanner;

class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a charecter");
        char ch = sc.next().charAt(0);

        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
        
         if (Character.isLetter(ch)) {
            System.out.println(ch + " is an alphabet.");
        } else {
            System.out.println(ch + " is not an alphabet.");

            
        }
        sc.close();
    
    }

}

