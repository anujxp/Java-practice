//    61) WAP to find out all the leap years between two entered years
import java.util.Scanner;
class Q61 {
public static void main(String[] args) {
    
    Scanner se = new Scanner(System.in);

    System.out.println("Enter first year ");
    int year1 = se.nextInt();
    System.out.println("Enter first year");
    int year2 = se.nextInt();
    int count = 0;
    while(year1<= year2)
    {
        if(year1 % 4 == 0 &&  year1 %  100 != 0 || year1 % 400 == 0){
            System.out.println(year1);
            count++;
        }
        year1++;
    }
    System.out.println("total number 0f leap year"+count);

    
}
    
}
