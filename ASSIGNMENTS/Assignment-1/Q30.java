// How many tiles of length 5 cm and breadth 8 cm are needed to tile the floor of a bed room 200 cm long and 400 cm wide?
class Test{
    public static void main(String args[])
    {
        int l = 5, b= 8;
        int areat = l*b;
        int fl = 200, fb = 400;
        int areafl = fl*fb;
        System.out.println("tile needed "+ areafl/areat);

    }
}
