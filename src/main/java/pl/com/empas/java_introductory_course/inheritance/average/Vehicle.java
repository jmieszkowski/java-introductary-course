package pl.com.empas.java_introductory_course.inheritance.average;

public class Vehicle {
    protected String desription = "Vehicle";

    private int yearOfProduction = 1980;

    public Vehicle() {
        whoAmI();
    }

    public void move() {
        System.out.println("Vehicle is moving");
    }

    private void whoAmI() {
        System.out.println("I'm " + desription);
    }
}
