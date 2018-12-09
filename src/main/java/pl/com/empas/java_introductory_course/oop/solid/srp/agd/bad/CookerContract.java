package pl.com.empas.java_introductory_course.oop.solid.srp.agd.bad;

import java.util.Collection;

public interface CookerContract {

    Food fry(RawFood food);

    Food bake(RawFood food);

    Collection<CleanDish> makeTheDishes(Collection<Dish> dishes);


    class Food {}
    class RawFood {}
    class Dish {}
    class CleanDish {}
}
