package pl.com.empas.java_introductory_course.polymorphism.casting;

public class Aeroplane extends Vehicle {

    @Override
    public void move() {
        System.out.println("Aeroplane is moving on the runway");
    }

    public void fly() {
        System.out.println("Aeroplane is flying in the sky");
    }
}
