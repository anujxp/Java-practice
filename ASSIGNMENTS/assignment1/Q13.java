// The area of a right triangle is 184 cm² and one of its legs is 16 cm long. Find the length of other leg.
public class Q13{
    public static void main(String args[]) {

        double area = 184.0;
        double s1 = 16.0;
        double s2 = (2 * area) / s1;

        System.out.println("The other leg of the triangle is: " + s2+ " cm");
    }
}