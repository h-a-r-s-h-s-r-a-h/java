package fan;

public class Fan_runner {
    public static void main(String[] args) {
        Making_fan definite = new Making_fan("Manufacturer1", 0.999, "Orange");
        definite.switchOn();
        definite.setSpeed(5);
        System.out.println(definite);

    }
    
}
