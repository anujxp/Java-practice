// Find the area of a right angled triangle whose hypotenuse is 13 cm and one of its sides containing the right angle is 12 cm. Find the length of the other side.
class Q12 {
    public static void main(String args[]){
    double hypotenuse = 13.0,oneLeg = 12.0;
    double otherLeg = Math.sqrt(hypotenuse * hypotenuse - oneLeg * oneLeg);
    double area = 0.5 * oneLeg * otherLeg;
    System.out.println("Other side (leg): " + otherLeg + " cm");
    System.out.println("Area of the triangle: " + area + " cmsquare");
    }

}