
// Input: arr[] = {1, 14, 2, 16, 10, 20}
// Output: 14
// Explanation: Largest element is 20, second largest element is 16 and third largest element is 14


class findTop3 {
    static void find(int[] arr) {

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > first) {
                third = second;
                second = first;
                first = i;
            }
            else if(i>second){
                third = second;
                second = i;

            }
            else if(i>third)
            third = i;
        }
        System.out.println("--------------------------------------------");
        System.out.println("First : "+ first + "\nSecond : " + second + "\nThird : " + third );
        System.out.println("--------------------------------------------");

    }
    public static void main(String[] args) {
        int arr[] = {1, 14, 2, 16, 10, 20};
        find(arr);
    }
}
