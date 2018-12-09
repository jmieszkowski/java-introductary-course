package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.collections.common.Departament;
import pl.com.empas.java_introductory_course.collections.common.DepartamentGenerator;
import pl.com.empas.java_introductory_course.collections.common.Employee;


import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToLongFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JointExample1 {

    public static void main(String[] args) {

        //Departament i Employee z pakietu collections.common
        Map<Departament, List<Employee>> departaments = DepartamentGenerator.getDepartamentsWithEmployeesMap();
        Stream<Departament> departamentsStream = departaments.keySet().stream();

        Stream<Departament> resultStream = departamentsStream.filter(
                departament -> departament.getBudget() < departaments.get(departament)
                        .stream().mapToLong(Employee::getSalary).sum());

        System.out.println(resultStream.collect(Collectors.toList()));

        //Ekwiwalent:
        ToLongFunction<Employee> function = new ToLongFunction<Employee>() {

            @Override
            public long applyAsLong(Employee value) {
                return value.getSalary();
            }
        };

        Predicate<Departament> predicate = new Predicate<Departament>() {
            @Override
            public boolean test(Departament departament) {
                return departament.getBudget() < departaments.get(departament)
                        .stream().mapToLong(function).sum();
            }
        };

        resultStream = departamentsStream.filter(predicate);

    }
}
