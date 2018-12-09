package pl.com.empas.java_introductory_course.java8.examples;

import java.util.Arrays;
import java.util.List;

public class NonNegativeSumExample {

    public static void main(String[] args) {
        //Oblicz sumę nieujemnych elementów
        List<Integer> listInt = Arrays.asList(8, 9, 111, 23, 44, 55, 1, -123, 66, 88, -12345);
        System.out.println(
                listInt
                        .stream() // pobieramy strumień z listy elementów
                        .mapToInt(x -> x) // mapujemy "ogólny" strumień na specjalny strumień Integerów
                        .filter(x -> x >= 0) // filtrujemy elementy większe od lub równe zero
                        .sum() //Sumujemy - metoda specyficzna dla strumienia Integerów/Longów/Doubli
        );
    }
}
