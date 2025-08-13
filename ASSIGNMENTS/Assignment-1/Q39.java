// Find the surface of the cylinder if its diameter is 12 centimeters and its height is 9 centimeters.
class Test{
   public static void main(String args[]){
        double radius = 6;
        double height = 9;
        double PI = 3.14;
        double curvedSurfaceArea = 2* PI * radius * height ;
        double baseArea = 2 * PI *radius*radius;
        double totalSurfaceArea = curvedSurfaceArea + baseArea;
        System.out.println(" total surface area of cylandrical solid : "+ totalSurfaceArea+ " m ^2");

   
   
   }
   }