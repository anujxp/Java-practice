 class MathOperation {

    public int multiply(int a, int b) {
        return a * b;
    }

    public float multiply(float a, float b, float c) {
        return a * b * c;
    }

    public int multiply(int[] arr) {
        int result = 1;
        for (int num : arr) {
            result *= num;
        }
        return result;
    }

    public double multiply(double a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        MathOperation mathOp = new MathOperation();

        int prodInt = mathOp.multiply(4, 5);
        System.out.println("Multiplication of two integers: " + prodInt);

        float prodFloat = mathOp.multiply(1.5f, 2.0f, 3.0f);
        System.out.println("Multiplication of three floats: " + prodFloat);

        int[] arr = { 2, 3, 4 };
        int prodArray = mathOp.multiply(arr);
        System.out.println("Multiplication of array elements: " + prodArray);

        double prodDoubleInt = mathOp.multiply(5.5, 4);
        System.out.println("Multiplication of double and integer: " + prodDoubleInt);
    }
}
