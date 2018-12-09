package my_package.equals_and_hashcode;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();

        personList.add(new Person("Jędrzej", "M", 21));
        personList.add(new Person("Kamil", "S", 21));
        personList.add(new Person("Jędrzej", "M", 21));
        personList.add(new Person("Jędrzej", "M", 21));

        Person person = new Person("Jędrzej", "M", 21);
        System.out.println(personList.contains(person));

        Set<Person> personSet = new HashSet<>();
        personSet.addAll(personList);
        System.out.println("sets size " + personSet.size());
        System.out.println(personSet.contains(person));

        for(Person persons : personSet){
            System.out.println(persons);
        }


        Set<Person> anotherSet = new LinkedHashSet<>();
        List<Person> anotherList = new LinkedList<>();







    }
}
