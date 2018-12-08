package vehicle;

public class Main2 {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle boat = new Boat();

        Vehicle plane = new Plane();

        vehicle.move();
        car.move();
        boat.move();

        vehicle.increaseSpeed();
        car.increaseSpeed();
        boat.increaseSpeed();
        plane.increaseSpeed();

        processVehicle(car);

        increaseSpeed(car);
        increaseSpeed(boat);

        increaseSpeed(plane);


    }

    public static void processVehicle(Vehicle vehicle){

        System.out.println(vehicle);

    }

    public static void increaseSpeed(Vehicle vehicle){
        vehicle.increaseSpeed();
        System.out.println("increaseSpeed from Main2");
    }
}

