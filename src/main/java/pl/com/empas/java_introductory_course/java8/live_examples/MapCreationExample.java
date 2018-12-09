package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.EmployeeGenerator;

import java.util.List;
import java.util.stream.Collectors;

public class MapCreationExample {

    public static void main (String args []) {
        List<Employee> employeeList = EmployeeGenerator.generateRandomEmployeeList(100);


        //employeeList.stream().collect(Collectors.toMap();

    }
}
