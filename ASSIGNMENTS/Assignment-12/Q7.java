// 7. Custom Exception

// 👉 Create your own exception InvalidAgeException. If age < 18, throw the exception.

// class InvalidAgeException extends Exception {
//     InvalidAgeException(String msg) {
//         super(msg);
//     }
// // }
import java.util.Scanner;

class InvalidAgeException extends Exception {
    InvalidAgeException(String msg) {
    super(msg);
    }
    }

    
    class Main {
        public void checkAge(int age) throws InvalidAgeException {
            if(age<18)
            throw new InvalidAgeException("age must be greater then 18");       
            else 
            System.out.println("Access granted -- you are old");
        
        }
    public static void main(String[] args) {
    Scanner se = new Scanner(System.in);
    Main n1 = new Main();
        System.out.println("Enter your age :");
        int age = se.nextInt();
        try{
            n1.checkAge(age);        
        }
        catch (InvalidAgeException e) {
            System.out.println("exception cought -"+ e.getMessage());
        }
        

}
}