package pl.com.empas.java_introductory_course.java8.streams;

import java.util.List;

public class Order {
    List<Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Order(List<Item> items) {

        this.items = items;
    }
}
