package my_package.access.inner;

import my_package.access.Person;

public class Main {
    public static void main(String[] args) {
        Person jedrek = new Person("Jędrek", "M", -20);

        System.out.println(jedrek);

//        jedrek.secret = "my secret";
//        jedrek.secondSecret = "second secret";
        Child child = new Child();



    }
}
