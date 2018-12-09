package my_package.com.archlinux.jedrek;

public class Car {

    private String brand;
    private  String model;
    private String color;
    private int yearOfProduction;

    //constructor
    public Car(String brand, String model, String color, int yearOfProduction) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.yearOfProduction = yearOfProduction;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    @Override
    public String toString() {
        return "{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';

    }



    public static void main(String[] args) {
        //hyundai jest referencją
       Car hyundai = new Car("hyundai", "i20", "gray", 2015);
       System.out.println("Hyundai: " + hyundai);

       //porshe911 jest referencją
       Car porshe911 = new Car("porshe", "911", "red",2016);

        System.out.println("Color of porshe 991: " + porshe911.getColor());


    }

}
