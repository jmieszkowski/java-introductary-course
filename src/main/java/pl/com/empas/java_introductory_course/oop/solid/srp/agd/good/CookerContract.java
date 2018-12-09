package pl.com.empas.java_introductory_course.oop.solid.srp.agd.good;

import java.util.Collection;

public interface CookerContract {

    Food fry(RawFood food);

    Food bake(RawFood food);

    class Food {}
    class RawFood {}
}
