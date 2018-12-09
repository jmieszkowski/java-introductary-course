package pl.com.empas.java_introductory_course.java8.examples;

import pl.com.empas.java_introductory_course.collections.common.OrderedPair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindDuplicateMapValues {

    public static void main(String[] args) {
        //Collections.frequency(my_package.collection, element)
        //Stream<T> .count() :)
        //Znajdź ilość powtarzających się wartości w mapie

        Map<String, String> map = new HashMap<>();
        map.put("01", "aa");
        map.put("02", "bb");
        map.put("03", "cc");
        map.put("04", "dd");
        map.put("05", "aa");

        System.out.println(
                map.values().stream() //pobieramy strumień ze zbioru WARTOśCI mapy
                        //Używając metody statycznej Collections.frequency filtrujey jedynie
                        //te elementy, które występują więcej niż raz
                        .filter(x -> Collections.frequency(map.values(), x) > 1)
                        //ponieaż w naszym przykładzie filtr zwróci dwa razy wartość "aa",
                        // pozostawiamy jedynie wartości niepowtarzające się
                        .distinct()
                        // Zliczamy ilość wartości w strumieniu
                        .count()
                        //.map(x -> new OrderedPair<String, Integer>(x, Collections.frequency(map.values(), x)))
                        //.collect(Collectors.toList())
        );

        System.out.println(
                map.values().stream() //pobieramy strumień ze zbioru WARTOśCI mapy
                        //Używając metody statycznej Collections.frequency filtrujey jedynie
                        //te elementy, które występują więcej niż raz
                        .filter(x -> Collections.frequency(map.values(), x) > 1)
                        //ponieaż w naszym przykładzie filtr zwróci dwa razy wartość "aa",
                        // pozostawiamy jedynie wartości niepowtarzające się
                        .distinct()
                        //każdą wartość mapujemy do obiektu pary - obiekt pary będzie przechowywał wartość
                        //np. "aa" oraz liczbę wystąpień
                        //oraz zliczamy liczbę wystąpień
                        .map(x -> new OrderedPair<String, Integer>(x, Collections.frequency(map.values(), x)))
                        .collect(Collectors.toList())
        );
    }
}
