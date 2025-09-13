// Q.16
// Rearrange the array in alternating positive and negative items
// Given an unsorted array Arr of N positive and negative numbers. Your task is to create an array of alternate positive and negative numbers without changing the relative order of positive and negative numbers.
// Note: Array should start with positive number.

// Example 1:
// Input: 
// N = 9
// Arr[] = {9, 4, -2, -1, 5, 0, -5, -3, 2}
// Output:
// 9 -2 4 -1 5 -5 0 -3 2
// Example 2:
// Input: 
// N = 10
// Arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
// Output:
// 5 -5 2 -2 4 -8 7 1 8 0 


class Test {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8};
        int n = arr.length;
        int p = 0 , q = 0;

        int[] pos = new int[n];
        int[] neg = new int[n];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0)
                pos[p++] = arr[i];
            else
                neg[q++] = arr[i];
        }
        boolean turnpos= true;

        int i= 0,j=0 ,k=0;
        while (i<p&& j< q){
            if(turnpos)
             arr[k++] = pos[i++];
            else
            arr[k++] = neg[j++];
            turnpos = !turnpos;

            
        }
        while(i<p)
            arr[k++] = pos[i++];
        while (j<q) 
            arr[k++] = neg[j++];
           
        System.out.println("Rearrange array");
        for (int z : arr) {
            System.out.print(z+" ");
            
        }
        
    }

}