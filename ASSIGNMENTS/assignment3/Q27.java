// Check given character is vowel or not using switch case 

import java.util.Scanner;

public class Q27 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter a alphabet charecter  to check which is voowel or consonent");
        char c = sc.next().charAt(0);

        

        
        switch(c){
            case 'A':System.out.println("vowel");break;
            case 'E':System.out.println("vowel");break;
            case 'I':System.out.println("vowel");break;
            case 'O':System.out.println("vowel");break;
            case 'U':System.out.println("vowel");break;
            case 'a':System.out.println("vowel");break;
            case 'e':System.out.println("vowel");break;
            case 'i':System.out.println("vowel");break;
            case 'o':System.out.println("vowel");break;
            case 'u':System.out.println("vowel");break; 
            default:System.out.println("given charecter is consonent");break;
        }

        sc.close();


    }
}
