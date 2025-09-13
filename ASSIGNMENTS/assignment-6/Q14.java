// Q.14. Find the first non-repeating elment in given array of integers
// Find the first non-repeating element in a given array arr of N integers.
// Note: Array consists of only positive and negative integers and not zero.
// Example 1:
// Input : arr[] = {-1, 2, -1, 3, 2}
// Output : 3
// Explanation:
// -1 and 2 are repeating whereas 3 is 
// the only number occuring once.
// Hence, the output is 3.

// Example 2:
// Input : arr[] = {1, 1, 1}
// Output : 0


class Non{
    public int firstNonRepeat(int[] arr){

        for (int i = 0; i < arr.length; i++) {
            boolean isrepeat = false;
            for (int j = 0; j < arr.length; j++) {
                if (i!= j && arr[i]==arr[j]) {
                    isrepeat = true;
                    break;
 
                }
                
            }
            if (!isrepeat) {
                return arr[i];
            }
        }
        return 0;
    }
}
class Test{
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,5,6,6};
        Non n1 = new Non();
        int n = n1.firstNonRepeat(arr);
        System.out.println("first non repeative element is " + n);
    
    }
}