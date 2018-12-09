package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.EmployeeGenerator;

import java.util.List;

public class SumExample {

    public static void main(String [] args) {

        //Ten przykład używa klasy Employee z pakietu collections.common
        List<Employee> employeeList = EmployeeGenerator.getEmployeeList();
        long salarySum = employeeList.stream().mapToLong(x -> x.getSalary()).sum();
        System.out.println(employeeList);
        System.out.println(salarySum);
    }
}
