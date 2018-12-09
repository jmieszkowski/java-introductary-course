package pl.com.empas.java_introductory_course.collections.set;

import java.util.*;

public class LinkedHashSetExample {

    public static void main(String[] args) {

        Set<String> setOfStrings = new LinkedHashSet<>();

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jurek");
        listOfNames.add("Kasia");
        listOfNames.add("Ksenia");
        listOfNames.add("Kasia");

        setOfStrings.addAll(listOfNames);

        Iterator<String> stringIterator = setOfStrings.iterator();
        while (stringIterator.hasNext()) {
            System.out.println(String.format("Next element: [%s]", stringIterator.next()));
        }
    }
}
