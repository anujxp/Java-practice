import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);

        System.out.println("Enter two number to print factorial of bitween numbers");
        int n1 = se.nextInt();
        int n2 = se.nextInt();
        if (n1 <= n2) {
            while (n1 <= n2) {
                int i = 1;
                while (i <= 10) {
                    System.out.print(n1 * i + " ");
                    i++;
                }
                System.out.println("\n");
                n1++;
            }
        }
        if (n1 > n2) {
            System.out.println("you have entered n2 as biggest number thats why we are give this");
            while (n2 <= n1) {

                int i = 1;
                while (i <= 10) {
                    System.out.print(n2 * i + " ");
                    i++;
                }
                System.out.println("\n");
                n2++;

            }
        }

    }
}