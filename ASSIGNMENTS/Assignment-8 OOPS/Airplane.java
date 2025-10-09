// 12. Write a Java program to create a class called "Airplane" with a flight number, destination, and departure time attributes, and methods to check flight status and delay
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Airplane {

    // --- Attributes ---
    private String flightNumber;
    private String destination;
    private LocalDateTime departureTime;
    private boolean isDelayed;

    // --- Constructor ---
    // Used to create a new Airplane object with initial values.
    public Airplane(String flightNumber, String destination, LocalDateTime departureTime) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.isDelayed = false; // A flight is not delayed when it's first created.
    }

    // --- Methods ---

    /**
     * Checks the current status of the flight based on the current time.
     * @return A string indicating the flight's status ("On Time", "Delayed", or "Departed").
     */
    public String checkFlightStatus() {
        LocalDateTime now = LocalDateTime.now();
        
        // If the current time is after the departure time, it has departed.
        if (now.isAfter(this.departureTime)) {
            return "Departed";
        } 
        // If it hasn't departed but the isDelayed flag is true, it's delayed.
        else if (this.isDelayed) {
            return "Delayed";
        } 
        // Otherwise, it must be on time.
        else {
            return "On Time";
        }
    }

    /**
     * Delays the flight by a specified number of minutes.
     * @param minutes The number of minutes to delay the flight.
     */
    public void delay(int minutes) {
        if (minutes > 0) {
            // Add the minutes to the current departure time
            this.departureTime = this.departureTime.plusMinutes(minutes);
            // Set the flag to true
            this.isDelayed = true;
            System.out.println("Flight " + this.flightNumber + " has been delayed. New departure time: " + getFormattedDepartureTime());
        }
    }

    // --- Getter Methods ---
    // Used to get the values of the private attributes.

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getDestination() {
        return destination;
    }

    /**
     * Returns the departure time as a nicely formatted string.
     */
    public String getFormattedDepartureTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        return departureTime.format(formatter);
    }
}

public class FlightSystem {
    public static void main(String[] args) {
        System.out.println("✈️ Welcome to the Flight Status System! ✈️");
        System.out.println("------------------------------------------");

        // --- Scenario 1: A flight that is currently on time ---
        // Creating a flight scheduled to depart 2 hours from now.
        Airplane flight1 = new Airplane("AI202", "New York", LocalDateTime.now().plusHours(2));

        System.out.println("\nChecking Flight 1: " + flight1.getFlightNumber() + " to " + flight1.getDestination());
        System.out.println("Scheduled Departure: " + flight1.getFormattedDepartureTime());
        // Check initial status
        System.out.println("Initial Status: " + flight1.checkFlightStatus());

        // Now, let's delay the flight
        System.out.println("\n... Oh no, a delay is announced! Delaying by 45 minutes...");
        flight1.delay(45);
        
        // Check status again after the delay
        System.out.println("Updated Status: " + flight1.checkFlightStatus());
        
        System.out.println("------------------------------------------");

        // --- Scenario 2: A flight that has already departed ---
        // Creating a flight that was scheduled to depart 3 hours ago.
        Airplane flight2 = new Airplane("BA143", "London", LocalDateTime.now().minusHours(3));

        System.out.println("\nChecking Flight 2: " + flight2.getFlightNumber() + " to " + flight2.getDestination());
        System.out.println("Scheduled Departure: " + flight2.getFormattedDepartureTime());
        // Check its status
        System.out.println("Status: " + flight2.checkFlightStatus());
    }
}