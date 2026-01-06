// Sort an array without using built-in sort().

public class Sol5 {
public static void main(String[] args) {
    int arr[] = {1,2,4,54,4,24,6};
    for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < arr.length; j++) {
            int temp;
            if(arr[j] > arr[i])
            {
                temp  = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
    }
    for (int i : arr) {
        System.out.println(i);
    }
    
}
    
}
