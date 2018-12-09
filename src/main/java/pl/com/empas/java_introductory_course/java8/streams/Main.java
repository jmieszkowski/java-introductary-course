package pl.com.empas.java_introductory_course.java8.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        persons.add(new Person("Adam", "Adamski", 18, Sex.MALE, 180));
        persons.add(new Person("Ewa", "Orus", 25, Sex.FAMELE, 150));
        persons.add(new Person("Adam", "Malinowski", 18, Sex.MALE, 140));
        persons.add(new Person("Teodor", "Worlski", 18, Sex.MALE, 130));
        persons.add(new Person("Zenon", "Zdziarski", 18, Sex.MALE, 110));
        persons.add(new Person("Dagmara", "Kowalska", 30, Sex.FAMELE, 170));


        getFilteredObjects(persons, person -> person.getAge() > 18);
        getFilteredObjects(persons, person -> person.getSex() == Sex.MALE);


        List<Item> firstItemsList = new ArrayList<>();
        firstItemsList.add(new Item("TV", 1500));
        firstItemsList.add(new Item("Smartphone", 3500));
        firstItemsList.add(new Item("Watch", 500));

        List<Item> secondItemsList = new ArrayList<>();
        secondItemsList.add(new Item("Cukierki", 50));
        secondItemsList.add(new Item("Lizak", 5));

        Order first = new Order(firstItemsList);
        Order second = new Order(secondItemsList);

        for (Person p: persons) {
            p.setMyOrders(Arrays.asList(first, second));
        }
    }

    static private List<String> getChildrenSecrets(Person p) {
        return     p.getListOfChild().stream()
                .map(child -> child.getSecrets())
                .flatMap(secrets -> secrets.stream())
                .collect(toList());

    }

    static private List<Item> getItemsWithStream(Person p) {
        return p.getMyOrders().stream() // Stream<Order>
                .map(order -> order.getItems()) // Stream<List<Item>>
                .flatMap(items -> items.stream())
                .collect(toList());


    }

    static private List<Item> getItemsFromPerson(Person p) {
        List<Item> result = new ArrayList<>();
        for (Order o : p.getMyOrders()) {
            result.addAll(o.getItems());
        }

        return result;
    }

    static private List<Person> getMales(List<Person> persons) {
        return persons.stream()
                .filter(person -> person.getSex() == Sex.MALE)
                .collect(toList());
    }

    private static List<Person> getFilteredObjects(List<Person> persons, Predicate<Person> predicate) {
        return persons.stream()
                .filter(predicate)
                .collect(toList());
    }

    private static Map<String, Person> getMapOfFilteredPersons(List<Person> personList, Predicate<Person> predicate) {
        return  personList.stream()
                .filter(predicate)
                .collect(Collectors.toMap(person -> person.getSurname(), Function.identity()));
    }

}
