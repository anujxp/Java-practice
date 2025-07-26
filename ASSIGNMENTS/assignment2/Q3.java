// How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
import java.util.Scanner;

class Test  {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("To get floor area");
        System.out.println("Please Enter floor length and breadth :");
        int fl = sc.nextInt();
        int fb = sc.nextInt();
        int areaf = fl * fb;
        System.out.println("Area of Floor :"+ areaf);
        System.out.println(" Please Enter length of tile : ");
        int l  =  sc.nextInt();
        System.out.println(" Please Enter the breadth of tile:");
        int b  =  sc.nextInt();
        int areat = l * b ;
        System.out.println(" Area of tile : "+ areat);
        System.out.println("no. of tile requires :  "+ (areaf/areat));
        
        
    }
    
}
