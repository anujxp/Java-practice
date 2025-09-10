// 6. Finally Block Practice

// 👉 Open a Scanner, read an input, and always close the scanner in finally (show that finally always executes).

import java.util.InputMismatchException;
import java.util.Scanner;

class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            int n = sc.nextInt();
        }
        catch(InputMismatchException e){
            e.printStackTrace();
        }
        finally {
            sc.close();
            
        }
    }
}