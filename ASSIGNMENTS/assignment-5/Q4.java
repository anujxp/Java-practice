// 4. WAP to find an element in array.
import java.util.Scanner;


class Test{
    public static void main(String[] args) {

        Scanner se = new Scanner(System.in);
        int arr[] = new int[5];

        for(int i =0; i< 5;i++){
            arr[i] = se.nextInt();
        }

        System.out.println("enter the number to be searched");
        int key = se.nextInt();

        for(int i =0; i< 5;i++){
            if(arr[i] == key){
                System.out.println("key found at index "+i);
                break;
            }
        }
        
        

        
    }
}