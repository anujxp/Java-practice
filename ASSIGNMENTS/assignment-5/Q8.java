// 8. WAP to insert a element in array at specific position.
import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner se = new Scanner(System.in);
        System.out.println("How many numbers do you want to save?");
        int n = se.nextInt();
        int arr[] = new int[n];

        // System.out.println("Enter position to insert element: ");
        int i = 0;
        // int t = 0;// 'a' is a character to terminate the loop. 'a' is any character other than 'c
        do{
            System.out.println("Enter a position to Enter an Element: or press 0 to terminate");
            int pos = se.nextInt();
            // t = pos;
            if(pos == 0)
            break;
            //checking if the position is valid (0 to n-1
            if(pos<0 || pos>n){
                System.out.println("Enter a valid position");
            }
            else
            {System.out.println("Enter Elemnt : ");
            arr[pos-1] = se.nextInt();
            i++;
            
        }
        }while( i<n-1);

        System.out.println("The Array is :");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[j] + " ");
        }
    }
        
    
}
