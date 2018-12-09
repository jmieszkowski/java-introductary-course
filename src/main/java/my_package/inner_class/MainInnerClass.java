package my_package.inner_class;
import static my_package.inner_class.Vehicle.Wheel;

public class MainInnerClass {
    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle("car", new Wheel(20));

        Wheel wheels = new Wheel(3);

        System.out.println(vehicle);
        System.out.println(wheels);

//        House.Apartment apartment = new House.Apartment();




    }
}
