package collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<String> stringSet =  new HashSet<>();
        stringSet.add("one");
        stringSet.add("two");
        stringSet.add("one");
        System.out.println("Size: " + stringSet.size());
    }
}
