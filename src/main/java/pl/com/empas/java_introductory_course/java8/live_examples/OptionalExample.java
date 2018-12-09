package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.EmployeeGenerator;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class OptionalExample {

    public static void main(String [] args) {
        List<Employee> list = EmployeeGenerator.getEmployeeList();
        Optional<Employee> optionalFirst = list.stream().findFirst();
        System.out.println(optionalFirst.map(Employee::getSalary));
        Optional<Object> emptyEmployee = Collections.emptyList().stream().findFirst();
        System.out.println(emptyEmployee.map(Object::toString));

        optionalFirst.ifPresent(employee -> System.out.println(employee.getSalary()));

    }
}
