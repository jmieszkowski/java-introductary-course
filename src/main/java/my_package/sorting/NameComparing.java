package my_package.sorting;

public class NameComparing {

    public static int comparePersonByName(Person first, Person second){

        return first.getName().compareTo(second.getName());
    }
}
