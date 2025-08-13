// Find the cost of polishing the base of a cone whose height is 4cm and slant height 5 cm at the rate of 10 rs. Per sq. cm
class Test{
    public static void main(String args[]){
        double height= 4,sheight = 5,PI = 3.14;
        double radius = Math.sqrt(sheight*sheight-height*height);
        double baseArea = PI * radius*radius;

        System.out.println("cost for polishing the base area is :"+ baseArea);
        
    }
}