package pl.com.empas.java_introductory_course.java8.streams;

import java.util.List;

public class Child {
    String name;
    int age;
    List<String> secrets;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getSecrets() {
        return secrets;
    }

    public Child(String name, int age, List<String> secrets) {
        this.name = name;
        this.age = age;
        this.secrets = secrets;
    }

    public Child(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
