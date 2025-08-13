//Find the number of cubical boxes of cubical side 3 cm which can be accommodated in carton of dimensions 15 cm × 9 cm × 12 cm.
class Q23{
    public static void main(String args[])
    {
        int ce = 3;
        int l =  15, b = 9, h = 12;
        int areac = ce *ce * ce;
        int areaca =l* b* h;
        double nob = (double)(areaca/areac);
        System.out.println(nob);

    }
}