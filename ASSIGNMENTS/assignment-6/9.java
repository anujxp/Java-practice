
/*Q.9 Find the Union and Intersaction of two sorted array.
Given two arrays a[] and b[] of size n and m respectively. The task is to find union between these two arrays. 
Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in the union.
Example 1:
Input:
5 3
1 2 3 4 5
1 2 3
Output: 
5
Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:
Input:
6 2 
85 25 1 32 54 6
85 2 
Output: 
7
Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
*/
import java.util.Scanner;
 class Test {

    static boolean isPresent(int[] arr, int size, int key) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == key)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array a and b");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("Enter the Element of array 1 :");
        int a[] = new int[n1];
        for (int i = 0; i < n1; i++) {
         a[i] = sc.nextInt();

        }
        System.out.println("Enter the Element of array 2 :");
        int b[] = new int[n2];
        for (int i = 0; i < n2; i++) {
            b[i] = sc.nextInt();
        }
        for (int i : a) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : b) {
            System.out.print(i + " ");
        }
        System.out.println();
        int n = a.length;
        int m = b.length;

        // For Union
        int[] union = new int[n + m]; // maximum possible size
        int uIndex = 0;

        // Add elements of a[] to union[]
        for (int i = 0; i < n; i++) {
            if (!isPresent(union, uIndex, a[i])) {
                union[uIndex++] = a[i];
            }
        }

        // Add elements of b[] to union[] if not already present
        for (int i = 0; i < m; i++) {
            if (!isPresent(union, uIndex, b[i])) {
                union[uIndex++] = b[i];
            }
        }

        System.out.println("Union count: " + uIndex);
        System.out.print("Union elements: ");
        for (int i = 0; i < uIndex; i++) {
            System.out.print(union[i] + " ");
        }

        // For Intersection
        int[] intersection = new int[Math.min(n, m)];
        int iIndex = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (a[i] == b[j]) {
                    if (!isPresent(intersection, iIndex, a[i])) {
                        intersection[iIndex++] = a[i];
                    }
                }
            }
        }

        System.out.println("\n\nIntersection count: " + iIndex);
        System.out.print("Intersection elements: ");
        for (int i = 0; i < iIndex; i++) {
            System.out.print(intersection[i] + " ");
        }
    }
}


