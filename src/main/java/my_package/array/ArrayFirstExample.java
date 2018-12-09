package my_package.array;

import my_package.animal.Animal;
import my_package.animal.Cat;
import my_package.animal.Dog;

public class ArrayFirstExample {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = i + 1;
            System.out.println(firstArray[i]);

        }
        Animal[] animalArray = makeAnimals();
        for (Animal animal : animalArray) {
            System.out.println(animal);
        }

        Animal[] dogArray = new Dog[2];
        dogArray[0] = new Dog();
        dogArray[1] = new Dog();

        Animal[] catArray = new Cat[2];
        catArray[0] = new Cat();
        catArray[1] = new Cat();

        addCatToArray(animalArray);
        addCatToArray(dogArray);
        addCatToArray(catArray);

        for(Animal animal : animalArray){
            System.out.println(animal);
        }
        for(Animal dog : dogArray){
            System.out.println(dog);
        }
    }

    public static Animal[] makeAnimals() {
        Animal[] animalArray = new Animal[2];
        animalArray[0] = new Dog();
        animalArray[1] = new Cat();

        return animalArray;
    }

    public static void checkEnhancedFor() {
        Object[] objects = new Object[10];
        Dog[] dogs = new Dog[0];
        Cat[] cats = new Cat[1];

        for (Object o : objects) {
            System.out.println(o);
        }

        for (Dog d : dogs) {
            System.out.println(d);
        }
        for (Cat c : cats) {
            System.out.println(c);
        }
    }
    public static void processAnimalArray(Animal[] animals) {
        for (Animal animal : animals) {
            animal.whichAnimal();
        }
    }

    public static void addCatToArray(Animal[] cats){
        if(cats instanceof Cat[]){
            cats[0] = new Cat();
        }else {
            System.out.println("Warrning");
        }
    }

}
