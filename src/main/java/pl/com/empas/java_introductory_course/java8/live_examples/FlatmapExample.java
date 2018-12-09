package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.java8.live_examples.common.Departament;
import pl.com.empas.java_introductory_course.java8.live_examples.common.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapExample {

    public static void main(String[] args) {


        Stream<Employee> hrEmployeeStream = Stream.of(
                new Employee("Ania"),
                new Employee("Andrzej"),
                new Employee("Ania"));
        Stream<Employee> itEmployeeStream = Stream.of(
                new Employee("Agata"),
                new Employee("Stasio"),
                new Employee("Szczepan"));

        Stream<Departament> departamentStream = Stream.of(
                new Departament("it", itEmployeeStream.collect(Collectors.toList())),
                new Departament("hr", hrEmployeeStream.collect(Collectors.toList())));

        Stream<Employee> flatEmployeeStream1 =
                departamentStream
                        .flatMap(departament -> departament.getEmployess().stream())
                        .distinct();
        System.out.println(flatEmployeeStream1.collect(Collectors.toList()));

        //A teraz ekwiwalent krok po kroku:
        //poprzednie strumienie są już zamknięte, więc tworzę nowe
        hrEmployeeStream = Stream.of(
                new Employee("Ania"),
                new Employee("Andrzej"),
                new Employee("Ania"));
        itEmployeeStream = Stream.of(
                new Employee("Agata"),
                new Employee("Stasio"),
                new Employee("Szczepan"));

        departamentStream = Stream.of(
                new Departament("it", itEmployeeStream.collect(Collectors.toList())),
                new Departament("hr", hrEmployeeStream.collect(Collectors.toList())));

        //Funkcja zwracająca dla departamentu strumień listy pracowników
        Function<Departament, Stream<Employee>> flatFunction = new Function<Departament, Stream<Employee>>() {
            @Override
            public Stream<Employee> apply(Departament d) {
                return d.getEmployess().stream();
            }
        };

        //podajemy funkcję zamiast lambdy
        Stream<Employee> flatStream = departamentStream.flatMap(flatFunction);
        Stream<Employee> distinctEmployees = flatStream.distinct();
        System.out.println(distinctEmployees.collect(Collectors.toList()));
    }
}
