// Q.2 Find minimum and maximum element in array
class Test {
    public static void main(String[] args) {
        int arr[] = { 1,2,8,6,5};
        int max = arr[0], min = arr[0];
        for ( int i = 0; i< arr.length; i++)
        {
            if( max < arr[i])
             max = arr[i];
            if( min > arr[i])
            min = arr[i];
        }
        System.out.println("max :" + max + " min : "+ min);
    }
}
