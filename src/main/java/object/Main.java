package object;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Person jedrek = new Person();
        Person withoutSurname = new Person("Arek", 15);


        jedrek.introducePerson();
        withoutSurname.introducePerson();

        Person.somethingAboutPerson();
        Person.printNumberOfPerson();


    }
}
