// The base and height of a triangle are in the ratio 8 : 5 and its area is 320 m². Find the height and base of the triangle.
class Q11{
    public static void main(String arags[]){
        double area = 320;
        double baseRatio = 8;
        double heightratio = 5;
        double y = area/20;
        double x = Math.sqrt(y);
        double height = heightratio*x;
        double base = baseRatio*x;
        System.out.println("height"+height);
        System.out.println("base : " +base);


    }
}