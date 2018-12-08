package collection.map;



import com.archlinux.jedrek.Person;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindingPersonExample {
    public static void main(String[] args) {
        Map<String, Person> idsOverPerson = new HashMap<>();
        List<Person> peopleOver25 = new ArrayList<>();

        idsOverPerson.put("82", new Person("Jędrek", "M", 22));
        idsOverPerson.put("81", new Person("Janek", "S", 55));
        idsOverPerson.put("97", new Person("Jola", "B", 21));
        idsOverPerson.put("89", new Person("Kamil", "F", 78));
        idsOverPerson.put("85", new Person("Kacper", "K", 66));
        idsOverPerson.put("98", new Person("Konrad", "W", 98));
        idsOverPerson.put("99", new Person("Mariusz", "O", 45));
        idsOverPerson.put("79", new Person("Marek", "S", 33));
        idsOverPerson.put("74", new Person("Marta", "W", 37));
        idsOverPerson.put("64", new Person("Marian", "K", 60));

        for(String key : idsOverPerson.keySet()){
            if(idsOverPerson.get(key).getAge() > 25){
                System.out.println(idsOverPerson.get(key));
                peopleOver25.add(idsOverPerson.get(key));
            } else{
            }
        }
        System.out.println();
        System.out.println("New list");
        System.out.println();
        for (Person s : peopleOver25){
            System.out.println(s);
        }

    }
}
