// A wooded area is in the shape of a a trapezoid whose bases measure 128 m and 92 m and its height is 40 m. A 4 m wide walkway is constructed which runs perpendicular to the two bases. Calculate the area of the wooded area after the addition of the walkway.


class Test{
    public static void main(Stirng args[]){

        double base1 = 128; // in meters
        double base2 = 92;
        double height = 40;
        double walkwayWidth = 4;

        // Step 1: Calculate original area of trapezoid
        double trapezoidArea = 0.5 * (base1 + base2) * height;

        // Step 2: Calculate area of walkway (a rectangle)
        double walkwayArea = walkwayWidth * height;

        // Step 3: Subtract walkway area from trapezoid area
        double remainingArea = trapezoidArea - walkwayArea;

        // Output results
        System.out.println("Original area of trapezoid: " + trapezoidArea + " m²");
        System.out.println("Area of walkway: " + walkwayArea + " m");
        System.out.println("Remaining wooded area after walkway: " + remainingArea + " m²");
    }
    
}