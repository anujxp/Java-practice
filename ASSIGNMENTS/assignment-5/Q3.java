// 3. WAP to program calaculate the sum of all even element and all odd element of array
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        int arr[] = new int[10];

        Scanner se = new Scanner(System.in);
        int sumeven = 0,sumodd=0;
        System.out.println("Enter 10 number to calculate sum");

        for (int i = 0; i < 10; i++) {
            arr[i] = se.nextInt();`
            if(arr[i] %2 == 0)
            sumeven += arr[i];
            else
            sumodd += arr[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("sumeven: "+sumeven + "sumodd"+ sumodd);


    }
}
