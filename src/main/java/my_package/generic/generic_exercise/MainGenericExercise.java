package my_package.generic.generic_exercise;

import my_package.animal.Dog;

public class MainGenericExercise {
    public static void main(String[] args) {

        AnimalGenericHolder<Dog> dog1 = new AnimalGenericHolder<>();
        dog1.setAnimal(new Dog());
        dog1.enterHome();
        dog1.goOutside();

//        AnimalGenericHolder<Integer>
//        AnimalGenericHolder<Object>

    }
}
