package pl.com.empas.java_introductory_course.collections.lists;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class DequeExample {

    public static void main(String [] args) {
        Deque<String> deque = new LinkedList<>();
        deque.add("Orange");
        deque.add("Apple");
        deque.add("Banana");


        System.out.println(deque.peekFirst() + " " + deque);
        System.out.println(deque.peekLast() + " " + deque);

        System.out.println(deque.pollFirst() + " " + deque);
        System.out.println(deque.pollLast() + " " + deque);

        List<String> list = (List<String>) deque;
        System.out.println(list);


    }
}
