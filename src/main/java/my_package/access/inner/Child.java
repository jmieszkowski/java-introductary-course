package my_package.access.inner;

import my_package.access.Person;

public class Child extends Person {

    public void sayHello(){

//        System.out.println("My secret" + secret); // this gives an error, cuz it cant be accessed from another package
        System.out.println("My second secret" + secondSecret);
    }

}
