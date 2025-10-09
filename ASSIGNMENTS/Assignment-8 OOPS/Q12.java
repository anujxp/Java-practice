// 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay.

class Airplane {
    int flightNumber;
    String destination;
    String departureTime; // in HH:MM format (string for simplicity)

    // Constructor
    Airplane(int fNo, String dest, String dTime) {
        flightNumber = fNo;
        destination = dest;
        departureTime = dTime;
    }

    // Method to check flight status (simple demo using if-else)
    void checkStatus(String currentTime) {
        if(currentTime.equals(departureTime)) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is Departing now.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is On Time. Departure at " + departureTime);
        }
    }

    // Overloaded Method to check delay
    void checkStatus(String currentTime, int delayMinutes) {
        if(delayMinutes > 0) {
            System.out.println("Flight " + flightNumber + " to " + destination + " is Delayed by " + delayMinutes + " minutes.");
        } else {
            System.out.println("Flight " + flightNumber + " to " + destination + " is On Time. Departure at " + departureTime);
        }
    }
}

// Main class
class TestAirplane {
    public static void main(String[] args) {
        // Creating airplane objects
        Airplane a1 = new Airplane(101, "Delhi", "10:30");
        Airplane a2 = new Airplane(202, "Mumbai", "11:15");

        // Checking flight status
        a1.checkStatus("10:30");          // exact time
        a2.checkStatus("10:45");          // not equal → On Time

        // Checking flight delay using method overloading
        a1.checkStatus("10:30", 15);      // delayed
        a2.checkStatus("11:15", 0);       // on time
    }
}
