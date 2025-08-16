import java.util.Scanner;

 class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0;
        int place = 1; 
        // To place digits in correct position (units, tens, hundreds...)

        while (decimal > 0) {
            int remainder = decimal % 2;        // Get the remainder (0 or 1)
            binary = binary + remainder * place; // Form the binary number
            decimal = decimal / 2;               // Reduce the number
            place = place * 10;                  // Shift place to left (10, 100, 1000...)
        }

        System.out.println("Binary number: " + binary);
    }
}
