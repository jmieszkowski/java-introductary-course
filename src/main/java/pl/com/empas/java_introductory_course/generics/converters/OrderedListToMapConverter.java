package pl.com.empas.java_introductory_course.generics.converters;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OrderedListToMapConverter<E> implements ConverterContract<List<E>, Map<Integer, E>> {
    @Override
    public Map<Integer, E> convert(List<E> value) {
        Map<Integer, E> map = new HashMap<>();
        for(E elem : value) {
            map.put(value.indexOf(elem), elem);
        }
        return map;
    }

    public static void main(String [] args) {
        ConverterContract<List<String>, Map<Integer, String>> listToMapConverter = new OrderedListToMapConverter<>();
        List<String> list = Arrays.asList("Piotrek", "Stefan", "Andrzej");
        Map<Integer, String> map = listToMapConverter.convert(list);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("Klucz: " + entry.getKey() + " wartość: " + entry.getValue());
        }

        System.out.println(map.get(2));
        System.out.println(map.get(5));
        //map returns null for a non existen key value, even if the key my_package.object violates key type constraint
        System.out.println(map.get("er"));



    }
}
