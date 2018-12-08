package exercise18_11;



import interface_example.Car;
import interface_example.Vehicle;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Car> carList = new ArrayList<>();
        List<Vehicle> vehicleList = new ArrayList<>();

        GenericVehicleTest.addCar(vehicleList);
        GenericVehicleTest.getVehicleList(vehicleList);

        GenericVehicleTest.addCar(carList);
        GenericVehicleTest.getVehicleList(carList);
    }
}
