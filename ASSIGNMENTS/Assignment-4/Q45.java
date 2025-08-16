// 45) WAP to find out the sum of all the digits of a number
class Test {
    public static void main(String[] args) {
        int n = 12345;
        int sum =  0;
        
        while(n>0){
            int d = n%10;
            sum  += d;
            n /= 10;
            
        }
        System.out.println(sum);
    }
}
