// What is the surface area of a cylinder if the diameter is 15m height is 7m?
class Test{
   public static void main (String args[]){
        double radius = 7.5;
        double height = 7;
        double PI = 3.14;

        
        double curvedSurfaceArea = 2* PI * radius * height ;
        double baseArea = 2 * PI *radius*radius;
        double totalSurfaceArea = curvedSurfaceArea + baseArea;
        System.out.println(" total surface area of cylandrical solid : "+ totalSurfaceArea+ " m ^2");
        
   }
}