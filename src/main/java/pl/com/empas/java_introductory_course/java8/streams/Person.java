package pl.com.empas.java_introductory_course.java8.streams;

import java.util.List;

public class Person {
    String name;
    String surname;
    int age;
    Sex sex;
    int height;
    List<Order> myOrders;
    List<Child> listOfChild;

    public List<Child> getListOfChild() {
        return listOfChild;
    }

    public void setListOfChild(List<Child> listOfChild) {
        this.listOfChild = listOfChild;
    }

    public Person(String name, String surname, int age, Sex sex, int height) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
        this.height = height;
    }

    public List<Order> getMyOrders() {
        return myOrders;
    }

    public void setMyOrders(List<Order> myOrders) {
        this.myOrders = myOrders;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                ", height=" + height +
                ", myOrders=" + myOrders +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

