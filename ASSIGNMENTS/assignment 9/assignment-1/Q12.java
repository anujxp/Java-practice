import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input in the given format
        System.out.print("Enter numbers separated by commas: ");
        String input = sc.nextLine();  // Example: 67, 89, 23, 67, 12, 55, 66

        // Split the string on commas
        String[] numbers = input.split(",");

        int sum = 0;

        // Loop through each number string
        for (int i = 0; i < numbers.length; i++) {
            // Remove any spaces and convert to int
            int num = Integer.parseInt(numbers[i].trim());
            sum += num;
        }

        System.out.println("Sum of all integers = " + sum);
        sc.close();
    }
}
