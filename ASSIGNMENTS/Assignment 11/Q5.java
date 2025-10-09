/*
Problem 5: Smart Home System 🏠💡

Abstract class Appliance:
name, power

abstract methods turnOn(), turnOff()

concrete method showStatus()

Subclasses:

Fan

Light

WashingMachine

Interface SmartDevice with method connectWifi().

Only Light and WashingMachine are smart devices.

In main method, turn on/off appliances and connect smart ones to WiFi.
*/


interface SmartDevice{
    void connectWifi();
}
abstract class Appliance{
    private String name;
    private int  power;
    abstract void  turnOn();
    abstract void turnOff();
    void showStatus(){
        System.out.println("under guirantee");
    }

}


class Fan extends Appliance{
    void turnOn(){
        System.out.println("turning on the Fan....");

    }
    void turnOff(){
        System.out.println("turning off the Fan...");
    }
}

class Light extends Appliance implements SmartDevice{
    void turnOn(){
        System.out.println("turning on the Light..........");

    }
    void turnOff(){
        System.out.println("turning off the Light..........");
    }
    public void connectWifi(){
        System.out.println("connecting to wifi...........");
    }
}
class WashingMachine extends Appliance implements SmartDevice{
    void turnOn(){
        System.out.println("turning on the WashingMachine..........");

    }
    void turnOff(){
        System.out.println("turning off the WashingMachine..........");
    }
    public void connectWifi(){
        System.out.println("connecting to wifi...........");
    }
}


class Main{
    public static void main(String[] args) {
        Fan f1 = new Fan();
        WashingMachine w1 = new WashingMachine();
        Light l1 = new Light();
        f1.turnOn();
        f1.turnOff();
        w1.connectWifi();
        w1.turnOn();
    }
}