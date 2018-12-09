package my_package.package_test.vehicle;

public class Boat extends Vehicle {
    @Override // to jest adnotacja
    public void move() {
        System.out.println("Boat is swimming...");
    }

    public void swim(){
        System.out.println("swim()");
    }

    @Override
    public String toString() {
        return "Boat";
    }
    @Override
    public void increaseSpeed(){

        System.out.println("increaseSpeed from Boat");

    }
}
