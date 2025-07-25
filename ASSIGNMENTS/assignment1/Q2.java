// The area of a rectangle is 96 cm². If the breadth of the rectangle is 8 cm, find its length and perimeter. 
public class q2 {
    public static void main(String args[]){
        int l, b  = 8, area = 96,perimeter;
        l = area/b;
        perimeter = 2*(l+b);
        System.out.println("length : "+l);
        System.out.println("perimeter : "+perimeter);
        
    }

    
}
