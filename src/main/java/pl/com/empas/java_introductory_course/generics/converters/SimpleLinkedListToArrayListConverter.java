package pl.com.empas.java_introductory_course.generics.converters;

import pl.com.empas.java_introductory_course.generics.collections.SimpleLinkedList;

import java.util.ArrayList;
import java.util.Arrays;

public class SimpleLinkedListToArrayListConverter<E> implements ConverterContract<SimpleLinkedList<E>, ArrayList<E>> {

    public ArrayList<E> convert(SimpleLinkedList<E> linkedList) {
        ArrayList<E> arrayList = new ArrayList<E>();
        E tmp = linkedList.removeFirst();
        while(tmp != null) {
            arrayList.add(tmp);
            tmp = linkedList.removeFirst();
        }
        return arrayList;
    }


    public static void main(String [] args) {
        SimpleLinkedListToArrayListConverter<String> converter = new SimpleLinkedListToArrayListConverter<String>();
        ArrayList<String> list = converter.convert(new SimpleLinkedList<String>("Test", "String", "Linked", "List"));
        System.out.println(Arrays.toString(list.toArray()));
    }
}
