package my_package.sorting.sorting_exercise2;

public class CarPlayer {

    public void playWithCarAction(CarActions carActions, Car car){
        System.out.println("playWithCarAction");
        carActions.fly(car);
        carActions.move(car);

    }
}
