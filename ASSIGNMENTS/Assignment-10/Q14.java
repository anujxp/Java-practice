import java.util.Scanner;

class MathOperation {
    private double X;
    private double Y;
    private double R;

    public void init() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter value of X: ");
        X = scanner.nextDouble();
        System.out.print("Enter value of Y: ");
        Y = scanner.nextDouble();
        scanner.close();
    }

    public void add() {
        R = X + Y;
    }

    public void multiply() {
        R = X * Y;
    }

    public void power() {
        R = Math.pow(X, Y);
    }

    public void display() {
        System.out.println("Result: " + R);
    }

    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();

        mathOp.init();

        mathOp.add();
        System.out.print("Addition -> ");
        mathOp.display();

        mathOp.multiply();
        System.out.print("Multiplication -> ");
        mathOp.display();

        mathOp.power();
        System.out.print("Power (X^Y) -> ");
        mathOp.display();
    }
}
