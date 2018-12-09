package pl.com.empas.java_introductory_course.oop.solid.srp.agd.good;

import java.util.Collection;

public interface DishwasherContract {

    Collection<CleanDish> makeTheDishes(Collection<Dish> dishes);

    class Dish {}
    class CleanDish {}
}
