// Create an array of size 5. Ask the user for an index and print the element. Handle the case when the index is out of range.

// // Expected
// Enter index: 8
// java.lang.ArrayIndexOutOfBoundsException caught
import java.util.Scanner;

class  Main{
    public static void main(String[] args) {
        int[] arr  = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter index");
        int i = sc.nextInt();
        try{
            System.out.println(arr[i]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
        }

    }
}
