package pl.com.empas.java_introductory_course.collections.lists;

import java.util.*;

public class ListIteratorExample {

    private List<String> list = new LinkedList<>();

    public void addToList(Collection<String> collection) {
        this.list.addAll(collection);
    }

    public void modifyList(String elementToInsert, String elementToInsertAfter) {
        ListIterator<String> iterator = list.listIterator();

        while(iterator.hasNext()) {
            String s = iterator.next();
            if(elementToInsertAfter.equals(s)) {
                iterator.add(elementToInsert);
            }
        }
    }

    public void substituteFirst(String elementToSubstitute, String elementToSubstituteWith) {
        ListIterator<String> iterator = list.listIterator();
        while(iterator.hasNext()) {
            String s = iterator.next();
            if(s.equals(elementToSubstitute)) {
                iterator.set(elementToSubstituteWith);
                break;
            }
        }
    }

    public static void main(String [] args) {
        ListIteratorExample example = new ListIteratorExample();
        Collection<String> collection = Arrays.asList("Apple", "Banana", "Orange", "Grapefruit", "Orange");
        example.addToList(collection);
        example.modifyList("A KUKU", "Orange");
        System.out.println(example.list);
        example.substituteFirst("A KUKU", "Lemon");
        System.out.println(example.list);
     }
}
