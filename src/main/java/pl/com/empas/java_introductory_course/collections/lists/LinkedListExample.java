package pl.com.empas.java_introductory_course.collections.lists;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {


    public static void main (String [] args) {
        Deque<String> list = new LinkedList<>();
        list.addFirst("Orange");
        list.addFirst("Banana");
        list.addLast("Grapefruit");

        System.out.println(list);
        System.out.println(list.pop());
        System.out.println(list);

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
