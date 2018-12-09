package pl.com.empas.java_introductory_course.polymorphism.array.covariance;

import pl.com.empas.java_introductory_course.polymorphism.array.Animal;
import pl.com.empas.java_introductory_course.polymorphism.array.Cat;
import pl.com.empas.java_introductory_course.polymorphism.array.Dog;

public class SafeArrayCovariance {

    public static void main(String[] args) {
        Animal[] animals = new Dog[4];

        addCat(animals);
        addDog(animals);

        for (Animal animal : animals) {
            System.out.println("Animal is: " + animal);
        }
    }

    private static void addDog(Animal[] maybeDogs) {
        if (maybeDogs instanceof Dog[]) {
            System.out.println("I can add dog");
            maybeDogs[0] = new Dog();
        } else {
            System.out.println("This array isn't suitable for adding dog");
        }
    }

    private static void addCat(Animal[] maybeCats) {
        if (maybeCats instanceof Cat[]) {
            System.out.println("I can add cat");
            maybeCats[0] = new Cat();
        } else {
            System.out.println("This array isn't suitable for adding cats");
        }
    }
}
