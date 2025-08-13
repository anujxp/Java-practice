// How many bricks each 25 cm long, 10 cm wide and 7.5 cm thick will be required for a wall 20 m long, 2 m high and 0.75 m thick? If bricks sell at $900 per thousand what will it cost to build the wall?

class Q24{
    public static void main(String args[]){
        int bl = 25 , bb = 10;
        double bh = 7.5;
        double volb = (double)(bl * bb*bh);
        int wl = 2000, wb = 200, wh = 75;
        double volw =(double)(wl* wb* wh );
        double nob = volw/volb;
        System.out.println(nob);
        System.out.println("cost for bricks :"+ ((double)(nob*0.9)));

    }
}