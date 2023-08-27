package fan;

public class Making_fan {
    private String make;
    private double radius;
    private String color;
    private boolean isOn;
    private int speed;

    Making_fan(String make, double radius, String color){
        this.make = make;
        this.radius = radius;
        this.color = color;
    }

    public void switchOn(){
        this.isOn = true;
    }
    public void switchOff(){
        this.isOn = false;
        setSpeed(0);
    }

    public void setSpeed(int speed){
        this.speed = speed;
    }

    public String toString(){
        return String.format("make - %s, radius - %f, color - %s, isOn - %b, speed - %d",make,radius,color,isOn,speed);
    }
    
}
