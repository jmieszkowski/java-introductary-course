package pl.com.empas.java_introductory_course.generics.unchecked;

import java.util.ArrayList;
import java.util.List;

public class UnchekedExample {

    //Unsafe, unchecked 'legacy' method
    public static  void addAll(List target, List source) {
        for(Object e : source) {
            //Unchecked compiler warning.
            target.add(e);
        }

    }

    //safe generic wrapper for unsafe method
    public static <E> void addAllGeneric(List<E> target, List<E> source) {
        addAll(target, source);
    }

    public static void main(String [] args) {
        List<String> listString = new ArrayList<>();
        listString.add("test1");
        listString.add("test2");
        List<Integer> listInteger = new ArrayList<>();
        listInteger.add(1);
        listInteger.add(2);
        //unsafe unchecked method invocation. This will not fail in compile - time
        addAll(listString, listInteger);
        //safe method call - this would generate compile error
        //addAllGeneric(listString, listInteger);
        //--------------------------------------------
        //Runtime ClassCastException - now we have integers and Strings in a my_package.collection
        //Java tries to cast every my_package.object in my_package.collection to String upon iteration.
        for(String s : listString) {
            System.out.println(s);
        }
    }
}
