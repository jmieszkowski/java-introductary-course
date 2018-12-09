package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Employee;
import pl.com.empas.java_introductory_course.collections.common.EmployeeGenerator;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LambdaMapExample {

    Function<Employee, String> function = new Function<Employee, String>() {
        @Override
        public String apply(Employee employee) {
            return employee.getName();
        }
    };

    public static void main(String[] args) {

        List<Employee> list = EmployeeGenerator.getEmployeeList();
        Map<String, Employee> map = list.stream().collect(
                Collectors.toMap(Employee::getEmployeeId, Function.identity()));
        System.out.println(map);
    }
}
