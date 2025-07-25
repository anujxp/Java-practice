// If it costs 1600 rs. to fence a rectangular park of length 20 m at the rate of 25 rs. per m², find the breadth of the park and its perimeter. Also, find the area of the field.
class Q5{
    public static void main(String args[])
    {
        int totalCost = 1600,pmCost = 25,l = 20 ,b ;
        int area = totalCost/pmCost;
        b= area/l;
        int perimeter = 2*(l+b);
        System.out.println(" breadth of the park i s: "+b);
        System.out.println(" area of that field : "+area );
        System.out.println(" peri meter of that field : "+ perimeter);



    }
}