package pl.com.empas.java_introductory_course.collections.lists;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArrayListExample {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Pear");
        list.add("Banana");
        list.add(1, "Orange");
        list.add("orange");
        System.out.println(list);
        String replacedElement = list.set(0, "Grapefruit");

        int index = 10;
        if (list.size() <= index) {
            ((ArrayList<String>) list).ensureCapacity(index + 1);
        }
        list.add(index, null);
        System.out.println(list);
        System.out.println("Replaced value: " + replacedElement);


        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -o1.compareTo(o2);
            }
        });
        String[] array = list.toArray(new String[0]);


        System.out.println(list);
    }
}
