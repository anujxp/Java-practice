// 8. Write a Java program to create class called "TrafficLight" with attributes for color and duration, and methods to change the color and check for red or green.
class TrafficLight {
    private String color;
    private int duration;

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        this.color = newColor;
    }

    public boolean isRed() {
        return this.color.equals("red");
    }

    public boolean isGreen() {
        return this.color.equals("green");
    }

    public String getColor() {
        return this.color;
    }

    public int getDuration() {
        return this.duration;
    }
}

class TestMain {
    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight("red", 2000);
        if (trafficLight.isGreen()) {
            System.out.println("The traffic light is green.");
            
        }else
        System.out.println("red");
        System.out.println("Initial color: " + trafficLight.getColor());
        System.out.println("Initial duration: " + trafficLight.getDuration());
    }
}