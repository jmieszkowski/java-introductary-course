package my_package.sorting.sorting_exercise2;

@FunctionalInterface
public interface CarActions {
    void move(Car car);
    default void fly(Car car){
        System.out.println("Fly");
    }
}
