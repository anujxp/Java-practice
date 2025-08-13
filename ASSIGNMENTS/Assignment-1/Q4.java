// Find the cost of tiling a rectangular plot of land 300 m long and 150 m wide at the rate of $6 per hundred square m. 

class Q4{
    public static void main(String args[]){
        int l= 300, b = 150 ;
        int costpm = 6;
        int area = l*b;
        System.out.println("costing for tiling of that ractangular plot :"+((area/100)*6));


    }
}