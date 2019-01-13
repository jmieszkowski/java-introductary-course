package my_package.sorting.sorting_exercise2;

import java.util.Comparator;

public class PowerComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        //      200                 100
        //      100                 200
        //      200                 300
        return car1.getPower() - car2.getPower();
    }
}
