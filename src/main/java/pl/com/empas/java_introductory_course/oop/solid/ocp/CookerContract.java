package pl.com.empas.java_introductory_course.oop.solid.ocp;

public interface CookerContract {

    Food [] cook(RawFood [] rawFoods);
    Food [] bake(RawFood [] rawFoods);


    class Food {}
    class RawFood {}

}
