package pl.com.empas.java_introductory_course.inheritance.average;

public class Car extends Vehicle {

    public Car() {
        desription = "Car";

        iAm();

        // we do not inherit private things
        // whoAmI();
        // System.out.println("Year of production: " + yearOfProduction);
    }

    private void iAm() {
        System.out.println("I'm " + desription);
    }
}
