// Q.4 Write a program to sort the array
class Test {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 8, 6, 5,4};
        int n = arr.length;
        for( int i = 0 ; i < n; i++){
            for (int j = 0 ;j<n;j++){
                int temp = 0;
                if(arr[i] < arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    
                }

            }
        }
        for (int i = 0; i < n; i++) 
        System.out.print(arr[i]);



    }
}