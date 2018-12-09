package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class JointExample2 {

    public static void main(String[] args) {
        Map<Departament, List<Employee>> depMap = DepartamentGenerator.getDepartamentsWithEmployeesMap();

        System.out.println(
        depMap.entrySet().stream()
                .filter(entry -> entry.getValue().size() > 2)
                .map(entry -> entry.getKey()).collect(Collectors.toList()));


    }
}
