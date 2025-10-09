/*Problem Statement 

You are building a transportation system for a logistics company.

Requirements:

Every Vehicle should have:

a registration number,

a method to start,

a method to stop.

Some vehicles run on Fuel (like Car, Truck), while others run on Electricity (like ElectricBike, ElectricCar).

Create an interface Chargeable that forces all electric vehicles to implement:

chargeBattery() method.

Create an abstract class Vehicle that:

Stores the registration number.

Has abstract methods start() and stop().

Has a concrete method displayInfo() to show vehicle details.

Create subclasses:

Car (inherits from Vehicle) → Fuel based.

Truck (inherits from Vehicle) → Fuel based.

ElectricBike (inherits from Vehicle and implements Chargeable).

ElectricCar (inherits from Vehicle and implements Chargeable).

In the main class (TransportSystem),

Create objects of all types of vehicles.

Call their methods (start, stop, chargeBattery where required).

Expected Output Example
Car KA01AB1234 starting with petrol engine...
Car KA01AB1234 stopped.
Truck KA02XY9876 starting with diesel engine...
Truck KA02XY9876 stopped.
Electric Bike KA03EL5678 starting silently...
Electric Bike KA03EL5678 battery charging...
Electric Bike KA03EL5678 stopped.
Electric Car KA04EV4321 starting silently...
Electric Car KA04EV4321 battery charging...
Electric Car KA04EV4321 stopped.
*/

interface Chargeable {
    void chargeBattery();
}

abstract class vhicle {
    private String registrationNumber;

    public vhicle(String x) {
        this.registrationNumber = x;
    }

    abstract void start();

    abstract void stop();

    public String displayInfo() {
        return registrationNumber;
    }
}

class Car extends vhicle {
    public Car(String x) {
        super(x);
    }

    public void start() {
        System.out.println("Car " + displayInfo() + " starting with petrol engine...");
    }

    
    void stop() {
        System.out.println("Car " + displayInfo() + " stopped.");
    }
}

class Truck extends vhicle {
    public Truck(String x) {
        super(x);
    }

    public void start() {
        System.out.println("truck " + displayInfo() + " starting with petrol engine...");
    }

    void stop() {
        System.out.println("Truck " + displayInfo() + " stopped.");
    }
}

class ElectricBike extends vhicle implements Chargeable {
    public ElectricBike(String x) {
        super(x);
    }

    public void start() {
        System.out.println("Electric Bike " + displayInfo() + "starting silently... ");
    }

    void stop() {
        System.out.println("Electric Bike " + displayInfo() + "stopped ");
    }

    public void chargeBattery() {
        System.out.println("Electric Bike " + displayInfo() + "charging  ");

    }
}
class ElectricCar extends vhicle implements Chargeable {
    public ElectricCar(String x) {
        super(x);
    }

    public void start() {
        System.out.println("ElectricCar " + displayInfo() + "starting silently... ");
    }

    void stop() {
        System.out.println("ElectricCar " + displayInfo() + "stopped ");
    }

    public void chargeBattery() {
        System.out.println("ElectricCar " + displayInfo() + "Charging  ");

    }
}





class Main {
    public static void main(String[] args) {
        Car car = new Car("KA01AB1234");
        Truck truck = new Truck("KA02XY9876");
        ElectricBike bike = new ElectricBike("KA03EL5678");
        ElectricCar ecar = new ElectricCar("KA04EV4321");
        car.start();
        car.stop();
        truck.start();
        truck.stop();
        bike.start();
        bike.chargeBattery();
        bike.stop();
        ecar.start();
        ecar.chargeBattery();
        ecar.stop();
    }
}