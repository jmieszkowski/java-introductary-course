package pl.com.empas.java_introductory_course.generics.converters;

import pl.com.empas.java_introductory_course.generics.collections.SimpleLinkedList;

import java.util.Arrays;
import java.util.List;

public class ListToSimpleLinkedListConverter<E> implements ConverterContract<List<E>, SimpleLinkedList<E>> {
    @Override
    public SimpleLinkedList<E> convert(List<E> value) {
        SimpleLinkedList<E> sll = new SimpleLinkedList<>();
        for(E elem : value) {
            sll.addLast(elem);
        }
        return sll;
    }

    public static void main(String [] args) {
        List<String> list = Arrays.asList("Object 1", "Object 2", "Object 3");
        ConverterContract<List<String>, SimpleLinkedList<String>> converter = new ListToSimpleLinkedListConverter<>();
        SimpleLinkedList<String> linkedList = converter.convert(list);
        System.out.println(linkedList.toString());
    }
}
