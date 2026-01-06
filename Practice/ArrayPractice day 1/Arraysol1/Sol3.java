// 3. Find the second largest element in an array.
public class Sol3 {

    public static void getSecondSmall(int[] arr){
        if(arr.length<2)
            System.out.println("array is to short to determined");
            int temp = Integer.MAX_VALUE;
            int temp1 = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]< temp){
                temp1 = temp;
                temp = arr[i];
            }else if(arr[i] < temp1 && arr[i]!= temp)
                temp1 = arr[i];
                          
        }
        if(temp1 != Integer.MIN_VALUE)
        System.out.println("second smallext found :"+ temp1);
        else 
            System.out.println(" no such element found for the secondlargerst ");
    }
    public static void main(String[] args) {
        int arr[] = {1,2,34,4,5,67,7};
        getSecondSmall(arr);
        int temp = Integer.MIN_VALUE;
        int temp1 = Integer.MIN_VALUE;
        if(arr.length<2)
            System.out.println("array is to short to determined");

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]> temp){
                temp1 = temp;
                temp = arr[i];
            }else if(arr[i] > temp1 && arr[i]!= temp)
                temp1 = arr[i];
                          
        }
        if(temp1 != Integer.MIN_VALUE)
        System.out.println("second largest found"+ temp1);
        else 
            System.out.println(" no such element found for the secondlargerst ");
    }
}
