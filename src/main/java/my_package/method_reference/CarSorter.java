package my_package.method_reference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CarSorter {
    public static List<Car> sortCarsByModel(Car car1, Car car2, Sorter sorter){
        List<Car> result = new ArrayList<>();

        int order = sorter.sort(car1.getModel(), car2.getModel());

        if (order < 0){
            result.add(car1);
            result.add(car2);
        } else {
            result.add(car2);
            result.add(car1);

        }

        return result;
    }
}
