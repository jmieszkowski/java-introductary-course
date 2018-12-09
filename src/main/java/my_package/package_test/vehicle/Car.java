package my_package.package_test.vehicle;

public class Car extends Vehicle {

//    @Override
//    public void move() {
////        super.move();
//        System.out.println("Car is riding...");
//    }

    public void speedUp(){
        System.out.println("speedUp()");
    }

    @Override
    public String toString() {
        return "Car";
    }
    @Override
    public void increaseSpeed(){

        System.out.println("increaseSpeed from Car");

    }
}
