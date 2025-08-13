// 21) 1,	4,	9,	16,	25	…..

import java.util.Scanner;

class  Test {
    public static void main(String args[])
    {
        Scanner se = new Scanner(System.in);

        System.out.print("Enter a number to print the series:");
        int n = se.nextInt();

        int i  = 1;
        
        

        while(i<= n)
        {
            System.out.println(i*i);
            i++;

        }


    }    
}
