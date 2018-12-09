package pl.com.empas.java_introductory_course.polymorphism.interfaces.simple;

public class Main {

    public static void main(String[] args) {
        Car car = new Car();
        Aeroplane plane = new Aeroplane();

        Vehicle vehicle = car;
        vehicle.move();

        vehicle = plane;
        vehicle.move();

        Flyable flyable = plane;
        flyable.fly();
//        flyable.move();
    }
}
