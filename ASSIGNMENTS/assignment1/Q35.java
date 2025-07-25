// Find the surface area of the cylindrical solid whose radius is 7.7 cm and height is 12 cm.
class Test {
    public static void main (String args[]){
        double radius = 7.7;
        double height = 12;
        double PI = 3.14;

        
        double curvedSurfaceArea = 2* PI * radius * height ;
        double baseArea = 2 * PI *radius*radius;
        double totalSurfaceArea = curvedSurfaceArea + baseArea;
        System.out.println(" total surface area of cylandrical solid : "+ totalSurfaceArea);
        
    }
}