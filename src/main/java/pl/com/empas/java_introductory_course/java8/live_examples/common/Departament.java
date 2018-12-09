package pl.com.empas.java_introductory_course.java8.live_examples.common;

import java.util.List;

public class Departament {
    String name;

    public Departament(String name, List<Employee> employess) {
        this.name = name;
        this.employess = employess;
    }

    List<Employee> employess;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployess() {
        return employess;
    }

    public void setEmployess(List<Employee> employess) {
        this.employess = employess;
    }
}
