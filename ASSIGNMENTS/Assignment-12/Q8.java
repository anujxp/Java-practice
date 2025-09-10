// Checked vs Unchecked Exception

// 👉 Write a program with a method that throws IOException (checked) and another that throws ArithmeticException (unchecked). Show the difference in compiler behavior.
import java.io.IOException;

 class Main {


    public static void checkedExceptionMethod() throws IOException {
        throw new IOException("This is a checked exception.");
    }

    // Method that throws an UNCHECKED exception
    public static void uncheckedExceptionMethod() {
        int result = 10 / 0; // This will throw ArithmeticException
        System.out.println("Result is: " + result);
    }

    public static void main(String[] args) {
        // Handling CHECKED exception: must catch or declare
        try {
            checkedExceptionMethod();
        } catch (IOException e) {
            System.out.println("Caught checked exception: " + e.getMessage());
        }

        // Handling UNCHECKED exception: optional
        // No compiler error even if not handled
        uncheckedExceptionMethod(); // Will crash at runtime if not caught
    }
}
