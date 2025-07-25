//A brick measures 15 cm in length, 8 cm in breadth and 5 cm in height. How many bricks will be used to make a wall of length 15 m, breadth 10 m and height 8 metres?
class Q21{
    public static void main(String args[])
    {
        int bl = 15, bb  = 8 ,bh=  5 ;
        int volumeb = bl * bb * bh ;
        int wl = 1500, wb = 1000, wh = 800;
        int volumew = wl * wb * wh ;

        double nob = (double)(volumew / volumeb);
        System.out.println(nob);

    }
}