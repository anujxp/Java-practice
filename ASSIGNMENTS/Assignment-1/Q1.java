// The perimeter of a rectangle is 230 cm. If the length of the rectangle is 70 cm, find its breadth and area.
class q1{
    
    public static void main(String args[]){
        int perimeter = 230;
        int l = 70,b;

        b = (perimeter/2)- l;
        System.out.println("breadth "+b);
        int area = l*b;
        System.out.println(area);
    }
}