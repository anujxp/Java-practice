// Ron jogs around a rectangular park of length 50 m and breadth 30 m. If he takes 10 rounds of the park each day, how much distance does he cover in a day in km?
	
class Q18{

    public static void main(String[] args) {
        double length = 50.0; 
        double breadth = 30.0; 
        int roundsPerDay = 10;

        double perimeter = 2 * (length + breadth);
        double totalDistanceMeters = perimeter * roundsPerDay;
        double totalDistanceKm = totalDistanceMeters / 1000;
        System.out.println("Ron covers " + totalDistanceKm + " kilometers in a day.");
    }
}