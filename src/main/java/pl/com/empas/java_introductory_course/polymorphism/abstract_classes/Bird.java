package pl.com.empas.java_introductory_course.polymorphism.abstract_classes;

public class Bird extends Animal implements Flyable {

    public void move() {
        System.out.println("Bird is walking...");
    }

    public void fly() {
        System.out.println("Bird is mainly flying...");
    }
}
