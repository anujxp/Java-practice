// How many tiles whose length and breadth are 13 cm and 7 cm respectively are needed to cover a rectangular region whose length and breadth are 520 cm and 140 cm? 
class q3{
    public static void main(String args[]){
        int tl = 13 ,tb =7, rl = 520, rb = 140;
        int areaOfTile,areaOfRegion;
        areaOfTile = tl * tb ;
        areaOfRegion = rl *rb;
        System.out.println("Tiles needed " + (areaOfRegion/areaOfTile));
         
    }
}