package generic;


import animal.Animal;
import animal.Dog;

import java.util.List;

public class GenericCollections {

    public static void processAnimals(List<? extends Animal> animals){

        for(Animal a : animals){
            System.out.println(a);
        }

    }
    public static void processAnimal(Animal[] animals){
        for(Animal a : animals){
            System.out.println(a);
        }

    }
    public static void addDog(List<? super Dog> animals){
        animals.add(new Dog());

    }
}
