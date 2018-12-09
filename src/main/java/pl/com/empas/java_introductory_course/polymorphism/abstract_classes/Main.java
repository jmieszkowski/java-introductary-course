package pl.com.empas.java_introductory_course.polymorphism.abstract_classes;

public class Main {

    public static void main(String[] args) {
        Animal animal;
//        my_package.animal = new Animal();

        Mammal mammal;
//        mammal = new Mammal();

        animal = new Dog();
        animal.move();

        animal = new Bird();
        animal.move();

        Flyable canFly = (Flyable) animal;
        canFly.fly();
    }
}
