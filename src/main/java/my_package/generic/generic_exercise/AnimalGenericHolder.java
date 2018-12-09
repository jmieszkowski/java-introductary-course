package my_package.generic.generic_exercise;

import my_package.animal.Animal;

public class AnimalGenericHolder<xxx extends Animal> {
    xxx animal;

    public xxx getAnimal(){
        return animal;
    }
    public void setAnimal(xxx animal){
        this.animal = animal;
    }

    public void enterHome(){
        System.out.println(animal + "  --------------------Entered home");
    }
    public void goOutside(){
        System.out.println(animal + "  --------------------Went outside!");
    }
}

