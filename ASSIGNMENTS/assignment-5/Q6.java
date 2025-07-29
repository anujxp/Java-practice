
// //6. WAP to sort the array
// import java.util.Scanner;

// class Test {
//     public static void main(String[] args) {

//         Scanner se = new Scanner(System.in);
//         System.out.println("how many number you want to save");
//         int n = se.nextInt();
//         int arr[] = new int[n];
//         int max = 0;

//         System.out.println("Enter the array elements");
//         for (int i = 0; i < n; i++) {
//             arr[i] = se.nextInt();
//         }
//         int min = arr[0];

//         System.out.println("Before manipulation");
//         for (int i = 0; i < n; i++) 
//         System.out.print(arr[i] + " ");
//         max = arr[0];
//         for (int i = 0; i < n; i++) {
//             int temp = 0;
            
//                 if (max > arr[i]) {
//                     temp = arr[i];
//                     arr[i] = max;
//                     max = temp;
//                 }
            
//         }
//         System.out.println("\nAfter manipulation");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//         se.close();
//     }
// }


import java.util.Scanner;

class Test {
    public static void main(String[] args) {

        Scanner se = new Scanner(System.in);
        System.out.println("How many numbers do you want to save?");
        int n = se.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = se.nextInt();
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for better formatting

        // Bubble Sort Algorithm
        for (int i = 0; i < n - 1; i++) { // Outer loop for passes
            for (int j = 0; j < n - 1 - i; j++) { // Inner loop for comparisons and swaps
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("After sorting (Ascending Order):");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); // New line for better formatting

        se.close();
    }
}
