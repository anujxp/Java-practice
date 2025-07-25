// Find the area of a triangle, sides of which are 10 cm and 9 cm and the perimeter 36 cm.
class Q6 {
    public static void main(String args[]){
        int perimeter = 36 , a = 10 , b= 9 , c ,s;
        c = perimeter-a - b;
        // using herons formula
        s = (a+b+c )/2;
        int sq = (s*(s-a)*(s-b)*(s-c));
        float area = (float)(Math.sqrt(sq));
        System.out.println("area of triangle is :" + area);

        
    }
}