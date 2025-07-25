// The length of one of the diagonals of a field in the form of a quadrilateral is 46 m. The perpendicular distance of the other two vertices from the diagonal are 13 m and 10 m, find the area of the field.
class Q14{
     public static void main(String[] args) {
        double diagonal = 46.0;
        double height1 = 13.0;
        double height2 = 10.0;

        double area = 0.5 * diagonal * (height1 + height2);

        System.out.println("The area of the quadrilateral field is: " + area );
    }
}


