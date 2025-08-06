// Q.5 Find the kth largest and kth smallest element in array.
class Test {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 6, 5, 4 };
        // int arr1[] =;
        int n = arr.length;
        int k = 2;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                int temp = 0;
                if (arr[i] < arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;

                }
            }
        }
        System.out.println(k + "th smallest element :"+arr[k-1]);
        System.out.println(k + "th largest element :"+arr[n-k]);

    }
}