package pl.com.empas.java_introductory_course.java8.live_examples;

import pl.com.empas.java_introductory_course.java8.live_examples.common.Departament;
import pl.com.empas.java_introductory_course.java8.live_examples.common.Employee;

import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {


    public static void main(String [] args) {

        //Tworzymy strumień
        Stream<Employee> hrEmployeeStream = Stream.of(new Employee("Ania"), new Employee("Andrzej"), new Employee("Ania"));
        //Ze strumienia pracowników HR tworzymy nowy strumień, który nie zawiera powtórzeń
        Stream<Employee> distinctStream = hrEmployeeStream.distinct();


        Stream<Employee> itEmployeeStream = Stream.of(new Employee("Agata"), new Employee("Stasio"), new Employee("Szczepan"));



        //System.out.println(itEmployeeStream.map(function).collect(Collectors.toList()));
        //System.out.println(itEmployeeStream.map(employee -> employee.getName()).collect(Collectors.toList()));
        //System.out.println(itEmployeeStream.map(Employee::getName).collect(Collectors.toList()));


     }
}
