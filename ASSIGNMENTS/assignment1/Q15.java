// helly has a rectangular garden of length 22 m and breath 15 m. Her friend Rachel has a square garden of side 21 m. Whose garden is bigger and by how much?

class Q15{
    public static void main(String[] args) {
        
        int lengthShelly = 22;
        int breadthShelly = 15;
        int sideRachel = 21;

        int areaShelly = lengthShelly * breadthShelly;
        int areaRachel = sideRachel * sideRachel;

        System.out.println("Helly's garden area: " + areaShelly);
        System.out.println("Rachel's garden area: " + areaRachel );

        if (areaShelly > areaRachel) {
            System.out.println("Helly's garden is bigger by " + (areaShelly - areaRachel) );
        } else if (areaRachel > areaShelly) {
            System.out.println("Rachel's garden is bigger by " + (areaRachel - areaShelly));
        } else {
            System.out.println("Both gardens are of equal area.");
        }
    }
}