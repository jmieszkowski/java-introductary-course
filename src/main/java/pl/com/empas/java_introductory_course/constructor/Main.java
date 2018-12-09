package pl.com.empas.java_introductory_course.constructor;

import pl.com.empas.java_introductory_course.constructor.model.Car;
import pl.com.empas.java_introductory_course.constructor.model.RacingCar;
import pl.com.empas.java_introductory_course.constructor.model.Root;
import pl.com.empas.java_introductory_course.constructor.model.RootGrandson;

public class Main {

    public static void main(String[] args) {

        // check the output carefully
        Root root = new RootGrandson();

        Car car = new RacingCar();
    }
}
