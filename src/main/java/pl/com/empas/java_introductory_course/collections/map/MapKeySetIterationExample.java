package pl.com.empas.java_introductory_course.collections.map;

import pl.com.empas.java_introductory_course.collections.common.Employee;

import java.util.*;

public class MapKeySetIterationExample {

    //Klucz to numer pracownika uzupełniony zerami.
    Map<String, Employee> map = new TreeMap<>();

    public MapKeySetIterationExample(Map<String, Employee> map) {
        this.map.putAll(map);
    }

    public Set<Employee> getEmployeesWithNumberGreaterThan(int number) {
        Iterator<Employee> iterator = map.values().iterator();
        Set<Employee> employees = new HashSet<>();
        while(iterator.hasNext()) {
            Employee employee = iterator.next();
            if(employee.getEmployeeNumber() > number) {
                employees.add(employee);
            }
        }
        return employees;
    }

    public Set<Employee> getEmployeesWithNumberGreaterThan2(int number) {
        Set<Employee> employees = new HashSet<>();
        Iterator<String> iterator = map.keySet().iterator();
        while(iterator.hasNext()) {
            String key = iterator.next();
            int keyValue = Integer.parseInt(key);
            if(keyValue > number) {
                employees.add(map.get(key));
            }
        }
        return employees;
    }



    public static void main(String [] args) {
        Map<String, Employee> map = new HashMap<>();
        Employee andrzej = new Employee(1, "Andrzej", 10000);
        map.put("0001", andrzej);
        Employee stasio = new Employee(2, "Stasio", 12000);
        map.put("0002", stasio);
        Employee ania = new Employee(3, "Ania", 13000);
        map.put("0003", ania);
        Employee aniela = new Employee(4, "Aniela", 13400);
        map.put("0004", aniela);

        System.out.println("Key set: " + map.keySet());
        System.out.println("Values: " + map.values());

        MapKeySetIterationExample example = new MapKeySetIterationExample(map);
        System.out.println("getEmployeesWithNumberGreaterThan(1): " + example.getEmployeesWithNumberGreaterThan(1));
        System.out.println("getEmployeesWithNumberGreaterThan2(1)" + example.getEmployeesWithNumberGreaterThan2(1));

    }
}
