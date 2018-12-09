package pl.com.empas.java_introductory_course.java8.streams;

public class Item {
    String name;
    double price;

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Item(String name, double price) {

        this.name = name;
        this.price = price;
    }
}
