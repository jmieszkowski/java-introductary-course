package my_package.sorting.sorting_exercise2;

import java.time.LocalDate;

public class Car implements Comparable<Car>{

    private String colour;
    private String brand;
    private String model;
    private LocalDate productionYear;
    private int power;

    public Car(String colour, String brand, String model, LocalDate productionYear, int power) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
        this.productionYear = productionYear;
        this.power = power;
    }

    public String getColour() {
        return colour;
    }

    public String getBrand() {
        return brand;
    }


    public String getModel() {
        return model;
    }


    public LocalDate getProductionYear() {
        return productionYear;
    }


    public int getPower() {
        return power;
    }

    @Override
    public String toString() {
        return "Car{" +
                "colour='" + colour + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", power=" + power +
                '}';
    }

    @Override
    public int compareTo(Car car) {

        return productionYear.compareTo(car.getProductionYear());

    }

    public void maybeCompare(Comparable<Car> carComparable){

    }
}
