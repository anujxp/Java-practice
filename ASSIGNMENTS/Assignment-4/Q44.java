// 44) WAP to interchange first and last digit of a number
class Test {
    public static void main(String[] args) {
        int n = 43265;
        int i  = 0;
        int first = n%10;
        n = n / 10;
        int last = n/1000;
        n = n % 1000;
        
        int fiinal = (first *10000) +(n*10) + (last);
        System.out.println(fiinal);
        
        
    }
}
