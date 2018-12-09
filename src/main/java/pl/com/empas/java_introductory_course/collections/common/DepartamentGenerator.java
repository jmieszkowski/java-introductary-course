package pl.com.empas.java_introductory_course.collections.common;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DepartamentGenerator {

    public static List<Departament> getDepartaments() {
        return Arrays.asList(new Departament("HR", 1000L), new Departament("IT", 1500L), new Departament("Legal", 1300L));
    }

    public static Map<String, Departament> getDepartamentsMap() {
        return getDepartaments().stream().collect(Collectors.toMap(Departament::getName, x -> x));
    }

    public static Map<Departament, List<Employee>> getDepartamentsWithEmployeesMap() {
        Map<Departament, List<Employee>> map = new HashMap<>();
        map.put(getDepartamentsMap().get("HR"), Arrays.asList(
                EmployeeGenerator.generateEmployeeForName("Tomasz"),
                EmployeeGenerator.generateEmployeeForName("Ewa")));
        map.put(getDepartamentsMap().get("IT"), Arrays.asList(
                EmployeeGenerator.generateEmployeeForName("Piotr"),
                EmployeeGenerator.generateEmployeeForName("Natalia"),
                EmployeeGenerator.generateEmployeeForName("Zofia")));
        map.put(getDepartamentsMap().get("Legal"), Arrays.asList(
                EmployeeGenerator.generateEmployeeForName("Anna"),
                EmployeeGenerator.generateEmployeeForName("Paweł")));
        return map;
    }



}
