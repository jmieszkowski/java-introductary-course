package my_package.solid.single_object_responsibility;

public class DogTrainer {
    private String name;
    public DogTrainer(String name){
        this.name = name;
    }

    public void trainDog(Dog dog){
        System.out.println(String.format("Dog [%s] is trained by [%s]", dog.getName(), name));
    }
    public void goForWalk(Dog dog){
        System.out.println(String.format("Dog [%s] is walking with [%s]", dog.getName(), name));
    }
    public void firstAid(Dog dog){
        System.out.println(String.format("First aid for dog [%s] from [%s]", dog.getName(), name));

    }
    public void feedDog(Dog dog){
        System.out.println("Feeding dog " + dog.getName() + " by " + name);
    }


    @Override
    public String toString() {
        return "DogTrainer{" +
                "name='" + name + '\'' +
                '}';
    }
}
