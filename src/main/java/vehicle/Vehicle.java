package vehicle;

public class Vehicle {

    public void printName(){
        System.out.println("Vehicle");

    }

    public void increaseSpeed(){

        System.out.println("increaseSpeed from Vehicle");

    }

    public void move(){
        System.out.println("Vehicle is moving...");
    }

    @Override
    public String toString() {
        return "Vehicle";
    }
}
