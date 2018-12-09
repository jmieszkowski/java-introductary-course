package pl.com.empas.java_introductory_course.polymorphism.array;

public class Main {

    public static void main(String[] args) {
        Cat[] cats = new Cat[2];
        cats[0] = new Cat();
        cats[1] = new Cat();

        Dog[] dogs = new Dog[2];
        dogs[1] = new Dog();
        dogs[0] = new Dog();

        // animals array can hold all kinds of animals
        Animal[] animals = new Animal[3];
        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Pig();

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                System.out.println("It's dog!");
            } else if (animal instanceof Cat) {
                System.out.println("It's cat!");
            } else {
                System.out.println("I don't know this kind of my_package.animal");
            }
        }
    }
}
