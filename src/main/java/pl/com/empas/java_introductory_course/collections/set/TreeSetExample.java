package pl.com.empas.java_introductory_course.collections.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {
        Set<String> setOfStrings = new TreeSet<>();

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Jurek");
        listOfNames.add("Kasia");
        listOfNames.add("Ksenia");
        listOfNames.add("Kasia");
        listOfNames.add("Artur");
        listOfNames.add("Eryk");

        setOfStrings.addAll(listOfNames);

        System.out.println(setOfStrings);
    }
}
