
// 2. WAP to program to calculate the sum of all element of array.
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int arr[] = new int[10];

        Scanner se = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter 10 number to calculate sum");

        for (int i = 0; i < 10; i++) {
            arr[i] = se.nextInt();
            sum += arr[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(sum);


    }
}
