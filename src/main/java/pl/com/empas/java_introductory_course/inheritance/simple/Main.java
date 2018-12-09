package pl.com.empas.java_introductory_course.inheritance.simple;

public class Main {

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        vehicle.move();

        Car car = new Car();
        car.move();

        Aeroplane plane = new Aeroplane();
        plane.move();
        plane.fly();
    }
}
