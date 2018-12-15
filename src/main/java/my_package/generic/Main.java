package my_package.generic;

import my_package.animal.Animal;
import my_package.animal.Dog;
import my_package.com.archlinux.jedrek.Person;
import my_package.generic.method.Box;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        GenericHolder<String> stringHolder = new GenericHolder<>();
        GenericHolder<Integer> intHolder = new GenericHolder<>();
        intHolder.setSecret(1);
        stringHolder.setSecret("secret");

        ObjectHolder personHolder = new ObjectHolder();
        personHolder.setO(new Person("j","m",21));

        GenericHolder testHolder = new GenericHolder();
        testHolder.getSecret();

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Animal());
        animalList.add(new Animal());
        List<Dog> dogList = new ArrayList<>();
        dogList.add(new Dog());
        dogList.add(new Dog());
        

        Dog[] dogs = new Dog[2];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        GenericCollections.processAnimal(dogs);
        GenericCollections.processAnimals(dogList);

        GenericCollections.addDog(dogList);

        Box box = new Box("sad", new Object(), 1,1.0);

        System.out.println(box);




    }
}
