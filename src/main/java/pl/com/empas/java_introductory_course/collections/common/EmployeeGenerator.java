package pl.com.empas.java_introductory_course.collections.common;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeGenerator {

    static List<String> names = new ArrayList<>();

    static {
        names.add("Piotr");
        names.add("Agnieszka");
        names.add("Zofia");
        names.add("Natalia");
        names.add("Krzysztof");
        names.add("Tomasz");
        names.add("Ewa");
        names.add("Anna");
        names.add("Paweł");
    }

    static Random random = new Random(System.currentTimeMillis());


    public static List<Employee> getEmployeeList() {
        return getEmployeeStream().collect(Collectors.toList());
    }

    public static Set<Employee> getEmployeeSet() {
        return getEmployeeStream().collect(Collectors.toSet());
    }


    public static List<Employee> generateRandomEmployeeList(int length) {
        List<Employee> employees = new ArrayList<>();
        for(int i = 0; i < length; i++) {
            String name = names.get(random.nextInt(names.size()));
            employees.add(new Employee(random.nextInt(999), name, getEmployeeSalary(name)));
        }
        return employees;
    }

    public static Employee generateEmployeeForName(String name) {
        return new Employee(random.nextInt(999), name, getEmployeeSalary(name));
    }


    private static Stream<Employee> getEmployeeStream() {
        return names.stream().map(name -> new Employee(random.nextInt(1000), name, getEmployeeSalary(name)));
    }

    private static long getEmployeeSalary(String name) {
        return name.chars().asLongStream().sum();
    }

    public static long getEmployeeSalary(Employee employee) {
        return employee.getName().chars().asLongStream().sum();
    }
}
