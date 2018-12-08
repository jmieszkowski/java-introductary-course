package animal;

public class Main {
    public static void main(String[] args) {
        Dog rica = new Dog();

        rica.whichAnimal();
        rica.makeSound();

        Animal maybeDog = new Dog();
        Animal maybeCat = new Cat();

        Animal maybeMonkey = new Monkey();
        Object monkey = new Monkey();

//        maybeDog.makeSound();
        
    }
}
