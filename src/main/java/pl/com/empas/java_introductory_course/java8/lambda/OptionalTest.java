package pl.com.empas.java_introductory_course.java8.lambda;

import java.util.Optional;
import java.util.function.Function;

public class OptionalTest {

    public static void main(String[] args) {
        Optional<String> maybeString = null;
        Optional<String> maybeString1 = Optional.ofNullable("Ala ma kota");

        System.out.println(maybeString1.get());

        if (maybeString1.isPresent()) {
            System.out.println(maybeString1.get());
        } else {
            System.out.println("empty");
        }

        maybeString1.ifPresent(a -> System.out.println("This is: " + a));

        Optional<String> newOne = maybeString1.filter((String ala) -> ala.startsWith("Alfdfdafa"));

        Optional<String> maybeAla = Optional.of("Ala");
        Optional<Person> maybePerson = maybeAla.map(s -> {
            return new Person(s, "Anonim");
        }
        );

        Optional<String> fullName = maybePerson.map(p -> p.getName() + " " + p.getSurname());
        maybePerson.map(new Function<Person, String>() {
            @Override
            public String apply(Person person) {
                return person.getSurname() + " " + person.getName();
            }
        });

        Optional<String> maybeAdam = Optional.of("Adam");

        maybeAdam.map(name -> new Person(name, "Kowalski"))
                .filter(person -> "Kowalski".equals(person.getSurname()))
                .ifPresent(x -> System.out.println(x));
//                .ifPresent(System.out::println);
//                .ifPresent(System.out::println);

        Optional<String> maybeName = maybePerson.map(Person::getName);
        Optional<String> maybeName2 = maybePerson.map(person -> person.getName());
    }
}
