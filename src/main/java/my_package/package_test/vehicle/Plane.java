package my_package.package_test.vehicle;

public class Plane extends Vehicle{
    @Override
    public String toString() {
        return "Plane";
    }
    @Override
    public void increaseSpeed(){

        System.out.println("increaseSpeed from Plane");

    }
}
