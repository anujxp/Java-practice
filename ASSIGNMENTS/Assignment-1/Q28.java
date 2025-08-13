// A carpet is 5 m long and 4 m wide. Find its price at the rate of $ 205 per square meter.

class Test{
    public static void main(String args[])
    {
        //  
        int carpetlength = 5, carpetBreadth = 4;
        int costRate = 205;
        int carpetArea = carpetlength* carpetBreadth;

        System.out.println(" cost for "+ carpetArea+ " m^2 Carpet is " + (carpetArea*costRate));


    }
}