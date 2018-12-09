package pl.com.empas.java_introductory_course.constructor.model;

public class Car extends Vehicle {

    static {
        System.out.println("Cars's static block");
    }

    public Car() {
        super("Car");
    }
}
