// Q.6 Sort the array of 0s , 1s and 2s.
class Test {
    public static void main(String[] args) {
        int arr[] = { 0, 0, 1, 1, 2, 2, 0, 1, 2 };
        int arr1[] = { 0, 0, 1, 1, 2, 2, 0, 1, 2 };
        int low = 0, mid = 0, high = arr.length - 1, temp = 0;
        while (mid <= high) {
            if (arr[mid] == 0) {
                temp = arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            } else if (arr[mid] == 1)
                mid++;
            else {
                temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
        }
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i]);
    }
}
