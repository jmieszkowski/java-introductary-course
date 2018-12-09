package pl.com.empas.java_introductory_course.polymorphism.array.covariance;

import pl.com.empas.java_introductory_course.polymorphism.array.Animal;
import pl.com.empas.java_introductory_course.polymorphism.array.Cat;
import pl.com.empas.java_introductory_course.polymorphism.array.Dog;

public class ArrayCovariance {

    public static void main(String[] args) {

        // Dog[] extends Object[] = type covariance
        Dog[] dogs = new Dog[4];
        Object[] objects = dogs;

        Animal[] animals = new Cat[4];
        animals[0] = new Cat();

        // this will throw ArrayStoreException
        animals[1] = new Dog();

        // this would too
        // objects[0] = new Object();
    }
}
