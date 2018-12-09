package pl.com.empas.java_introductory_course.polymorphism.abstract_classes;

public abstract class Animal {
    protected int numberOfLegs;

    public Animal() {
        numberOfLegs = 4;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public abstract void move();
}
