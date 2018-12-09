package pl.com.empas.java_introductory_course.collections.order;

import java.util.Arrays;

public class ArraysSortingExample {

    public static void main(String[] args) {
        int[] intArray = {20, 9, 7, 8, 21};

        Arrays.sort(intArray);
        System.out.println("sorted int[] array: " + Arrays.toString(intArray));
        // cannot change natural ordering of primitive types
        //        Arrays.sort(intArray, (o1, o2) -> o2 - o1);

        Integer[] integers = {17, 18, 1};
        Arrays.sort(integers);
        System.out.println("sorted Integer[] array: " + Arrays.toString(integers));

        Arrays.sort(integers, (o1, o2) -> o2 - o1);
        System.out.println("reversed sorted Integer[] array: " + Arrays.toString(integers));
    }
}
