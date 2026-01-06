// 1. Find the largest element in an array.

class Sol1{
    public static void findMin(int[] arr){
        
        int temp = Integer.MAX_VALUE;
        for(int i= 0;i< arr.length; i++){
            if(arr[i] <temp)
                temp = arr[i];
        }
        System.out.println(temp);

    }
    public static void main(String args[]){
        int arr[] = {1,2,3,8,-7,4,5};
        findMin(arr);
        int max = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]> max)
                max = arr[i];
        }
        System.out.println(max);
    }


}