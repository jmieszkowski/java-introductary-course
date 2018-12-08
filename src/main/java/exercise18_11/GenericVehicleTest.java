package exercise18_11;

import interface_example.Car;
import interface_example.Vehicle;

import java.util.List;

public class GenericVehicleTest {

    public static void  getVehicleList(List<? extends Vehicle> vehicles){
        for(Vehicle v : vehicles){
            System.out.println(v);
        }
    }

    public static void addCar(List<? super Car> vehicles){
        vehicles.add(new Car());
    }
}
