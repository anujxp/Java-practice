// 29. How many square tiles of side 10 cm will be required to tile a floor measuring 800 cm by 900 cm?
class Test{

    public static void main(String args[]){

    
    // square

    int side = 10;
    // floor dimention
    int length = 800, breadth = 900;

    // area for both 
    int area = side * side ;
    int areaOfFloor =length*breadth;

    //calculating no.of breadth 
    int nob = areaOfFloor/area;
    System.out.println(nob + " tiles are requiered");

    }
}