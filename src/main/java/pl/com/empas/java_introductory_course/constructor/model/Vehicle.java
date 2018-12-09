package pl.com.empas.java_introductory_course.constructor.model;

public class Vehicle {

    static {
        System.out.println("Vehicle's static block");
    }

    private final String what;

    {
        System.out.println("Vehicle's init block");
    }

    public Vehicle(String what) {
        System.out.println("Vehicle's constructor");
        this.what = what;
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }
}
