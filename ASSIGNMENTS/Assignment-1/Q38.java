// The cylinder has a volume of 1287. The base has a radius 10. What is the area of the surface of the cylinder?
class Test{
   public static void main(String args[]){
    double vol = 1287 , radius = 10,PI = 3.14;
    double height = (vol)/(radius*radius* PI *2);
    double curvedSurfaceArea = 2* PI * radius * height ;
    double baseArea = 2 * PI *radius*radius; 
    double totalSurfaceArea = curvedSurfaceArea + baseArea;
    System.out.printf(" total surface area of cylandrical solid : %.2f\n",totalSurfaceArea);

        
   }
}