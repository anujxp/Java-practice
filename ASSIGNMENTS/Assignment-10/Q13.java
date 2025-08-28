import java.util.Scanner;

class Circle {
    // Data members
    private double radius;
    private double area;

    // Method to input radius from user
    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter radius of the circle: ");
        radius = scanner.nextDouble();
        scanner.close(); // Avoid closing here if you plan multiple inputs
    }

    // Method to calculate area
    public void calc() {
        area = Math.PI * radius * radius;
    }

    // Method to display area
    public void display() {
        System.out.println("Area of the circle: " + area);
    }

    // Main method to test the class
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.init();
        circle.calc();
        circle.display();
    }
} 
