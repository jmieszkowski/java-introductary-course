package pl.com.empas.java_introductory_course.collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SimpleSetExample {

    public static void main(String[] args) {
        Set<String> setOfStrings = new HashSet<>();

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jurek");
        listOfNames.add("Kasia");
        listOfNames.add("Ksenia");
        listOfNames.add("Kasia");

        setOfStrings.addAll(listOfNames);

        System.out.println(setOfStrings);
    }
}
