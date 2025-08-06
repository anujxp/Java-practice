/*Q.8
Given an unsorted array arr[] of size N having both negative and positive integers. The task is place all negative element at the end of array without changing the order of positive element and negative element.

Example 1:
Input : 
N = 8
arr[] = {1, -1, 3, 2, -7, -5, 11, 6 }
Output : 
1  3  2  11  6  -1  -7  -5

Example 2:
Input : 
N=8
arr[] = {-5, 7, -3, -4, 9, 10, -1, 11}
Output :
7  9  10  11  -5  -3  -4  -1
*/

class Test {
    public static void main(String[] args) {
        int arr[] = { 1, -1, 3, 2, -7, -5, 11, 6 };
        int n = arr.length;
        int j = 0;
        int arr1[] = new int[n];
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                arr1[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                arr1[j] = arr[i];
                j++;
            }

        }

        for (int i = 0; i < n; i++) {
            System.out.print(arr1[i] + " ");
        }
    }
}