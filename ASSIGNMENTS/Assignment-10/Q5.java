class Calculator {
    private double number1;
    private double number2;

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public double getNumber2() {
        return number2;
    }

    public double add() {
        return number1 + number2;
    }

    public double subtract() {
        return number1 - number2;
    }

    public double multiply() {
        return number1 * number2;
    }

    public double divide() {
        if (number2 == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return number1 / number2;
    }
}

class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.setNumber1(20);
        calc.setNumber2(5);
        System.out.println("Addition: " + calc.add());
        System.out.println("Subtraction: " + calc.subtract());
        System.out.println("Multiplication: " + calc.multiply());
        System.out.println("Division: " + calc.divide());
    }
}
