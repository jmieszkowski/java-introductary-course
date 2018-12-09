package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.EmployeeGenerator;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class FilterExample {

    static Predicate<Employee> predicate = new Predicate<Employee>() {
        @Override
        public boolean test(Employee employee) {
            boolean salaryCondition = employee.getSalary() > 500;
            boolean nameCondition = employee.getName().endsWith("a");
            return salaryCondition && nameCondition;
        }
    };

    public static void main(String [] args) {
        List<Employee> employeeList = EmployeeGenerator.getEmployeeList();

        //nice
        System.out.println(employeeList.stream()
                .filter(employee -> employee.getSalary() > 500)
                .filter(employee -> employee.getName().endsWith("a"))
                .collect(Collectors.toList()));

        //Not nice
        System.out.println(employeeList.stream()
                .filter(employee -> {
                    boolean salaryCondition = employee.getSalary() > 500;
                    boolean nameCondition = employee.getName().endsWith("a");
                    return salaryCondition && nameCondition;
                }).collect(Collectors.toList()));

        //using predicate
        System.out.println(employeeList.stream()
                .filter(predicate).collect(Collectors.toList()));

    }
}
