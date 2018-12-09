package pl.com.empas.java_introductory_course.oop.solid.ocp;

public class DualCookCooker implements CookerContract {

    int heaterNumber = 3;
    int ovensNumber = 2;

    @Override
    public Food[] cook(RawFood [] rawFoods) {
        if(rawFoods.length > heaterNumber )
            throw new RuntimeException("Too many raw foods to process");
        return new Food[heaterNumber];
    }

    @Override
    public Food [] bake(RawFood [] rawFoods) {
        if(rawFoods.length > ovensNumber )
            throw new RuntimeException("Too many raw foods to process");
        return new Food[ovensNumber];
    }
}
