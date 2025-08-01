/*Write a Java program to input basic salary of an employee and calculate its Gross salary according to following: Basic Salary <= 10000 : HRA = 20%, DA = 80% 
Basic Salary <= 20000 : HRA = 25%, DA = 90% 
Basic Salary > 20000 : HRA = 30%, DA = 95% 
*/

import java.util.Scanner;

class Test{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your basic salary:");
        double n = sc.nextInt();
        double  grossSalary =  0,hr = 0 , da = 0;
        


        if(n <= 10000){
            hr = 0.2;
            da = 0.8;
            
        }
        else if(n>10000 && n<= 20000){
            hr = 0.25;
            da = 0.90;
        }
        else if(n>20000 ){
            hr = 0.30;
            da = 0.95;
        }

        grossSalary = n*hr+n*da;
        System.out.println("hr = "+(n*hr)+"da = "+(n*da)+"\n"+"the gross salary is "+((grossSalary)));

           
            
        sc.close();


        
    }

}
