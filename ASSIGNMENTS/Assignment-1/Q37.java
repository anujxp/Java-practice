// The surface of the cylinder is 149 cm². The cylinder height is 6 cm. What is the diameter of this cylinder?
class Test{
    public static void main(String args[] ){
        //diemention
        double surfacearea = 149;
        double height = 6;
        double PI = 3.14;

// 2* PI * radius * height 
       float radius = (float)((surfacearea)/ (PI*height*2));

        System.out.printf("the radius = %.2f\n",radius);


    }
}