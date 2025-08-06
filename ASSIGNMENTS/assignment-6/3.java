// Q.3 Write a program to reverse the array.
class Test {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 6, 5,4};
        int n = arr.length;
           
        for (int i = 0; i < (n / 2); i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n-i-1] = temp;
        }
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i]);


    }
}
