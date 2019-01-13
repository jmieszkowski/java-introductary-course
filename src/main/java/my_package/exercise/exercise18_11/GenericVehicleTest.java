package my_package.exercise.exercise18_11;

import my_package.interface_example.Car;
import my_package.interface_example.Vehicle;

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
