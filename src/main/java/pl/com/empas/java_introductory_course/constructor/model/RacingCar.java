package pl.com.empas.java_introductory_course.constructor.model;

public class RacingCar extends Car {

    static {
        System.out.println("RacingCar's static block");
    }

    private String model;

    {
        System.out.println("RacingCar's init block");
    }

    public RacingCar() {
        this("Subaru");
        System.out.println("RacingCar's default constructor");
    }

    public RacingCar(String model) {
        super();
        this.model = model;
        System.out.println("RacingCar's constructor");
    }

    public String getModel() {
        return model;
    }
}
