// How many bricks will be required to lay a path 120 m long and 2.4 m breadth if a brick is 24 cm long and 15 cm wide?
class Q26{
    public static void main(String args[])
    {
        int length = 12000;int breadth = 240;
        int bl = 24, bb =15;
        int areap = length * breadth;
        int areaOfBrick = bl * bb;
        int nob = areap/areaOfBrick;
        System.out.println(nob+ " brick are requied ");
    }
}