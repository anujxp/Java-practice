// Find the sum of 28 terms of an Arithmetic Progression -21 -18 -15 -12 . . . . .
class Test{
    public static void main(String args[]){
        // required variables

        int a = -21 ;// first term
        int d =  3; // commonin diff
        int n = 28;
        int sum = (n * (2 * a + (n - 1) * d)) / 2;
        System.out.println("Sum of first 28 terms of the A.P. is: " + sum);
    }}