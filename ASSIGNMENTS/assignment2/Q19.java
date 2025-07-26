//A cube with an edge of 7 cm and a cuboid measuring 7 cm × 4 cm × 8 am are kept on a table. Which shape has more volume?
 
import java.util.Scanner;
class Q19{
    public static void main(String agrs[]){
         Scanner sc = new Scanner(System.in);
        System.out.println("lenght of a cuboid: ");
        int l = sc.nextInt();
        System.out.println("breath of a cuboid : ");
        int b=sc.nextInt();
        System.out.println("height of the cuboid : ");
        int h=sc.nextInt();
        int vol=l*b*h;
        System.out.println("volume of cuboid is : "+vol);

        
        
    }
}