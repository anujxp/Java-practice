// Find the 28th term of an Arithmetic Progression -21 -18 -15 -12 . . . . . 
class Test{
    public static void main(String args[]){
        // required variables

        int a = -21 ;// first term
        int d =  3 ;// coomon diff
        int n = 28;// Term to find 

        int nthTerm = a + (n-1)*d;
        System.out.println("The 28th term of the A.P. is: " + nthTerm);


    }
}