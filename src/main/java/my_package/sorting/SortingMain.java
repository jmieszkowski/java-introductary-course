package my_package.sorting;

import java.util.*;

public class SortingMain {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>(Arrays.asList(
                new Person("Asdkt", "ADtad", 21, 0, 10,185,14),
                new Person("Kgas", "Dsa", 89,140,150,124,8),
                new Person("Laskdla", "Asda", 35,20,60,194,20),
                new Person("Asdlakt", "Kdkas", 19,10,3,160,10),
                new Person("Kolasdi", "Kasdako", 12,200,12,150,11))
        );


        Collections.sort(people);
//
//  people.sort();
        Collections.sort(people, new ShoeComparator());
        Collections.sort(people, new IncomeComparator());

        Collections.sort(people, (o1, o2) -> (int) (o1.getHeight() - o2.getHeight()));
        Collections.sort(people, (o1, o2) -> (int) (o1.getShoeSize() - o2.getShoeSize()));

        Collections.sort(people, (o1, o2) -> o1.getName().compareTo(o2.getName()));
        Collections.sort(people, NameComparing::comparePersonByName);

        people.sort(((o1, o2) -> (int) (o1.getHeight() - o2.getHeight())));
        people.sort(NameComparing::comparePersonByName);
        System.out.println(people);



    }
}
