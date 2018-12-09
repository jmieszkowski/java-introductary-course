package pl.com.empas.java_introductory_course.collections;

import java.util.*;

public class CollectionBenchmark {

    public static void main(String [] args) {

        Random random = new Random(System.currentTimeMillis());

        Set<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < 10000000 ; i++) {
            hashSet.add(random.nextInt());
        }

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(hashSet);

        List<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(hashSet);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.addAll(hashSet);

        List<Integer> vector = new Vector<>();
        vector.addAll(hashSet);

        long start = System.currentTimeMillis();
        hashSet.contains(5);
        long stop = System.currentTimeMillis();
        System.out.println("HashSet.contains time: " + String.valueOf(stop - start));

        start = System.currentTimeMillis();
        treeSet.contains(5);
        stop = System.currentTimeMillis();
        System.out.println("TreeSet.contains time: " + String.valueOf(stop - start));

        start = System.currentTimeMillis();
        linkedList.contains(5);
        stop = System.currentTimeMillis();
        System.out.println("LinkedList.contains time: " + String.valueOf(stop - start));

        start = System.currentTimeMillis();
        arrayList.contains(5);
        stop = System.currentTimeMillis();
        System.out.println("ArrayList.contains time: " + String.valueOf(stop - start));

        start = System.currentTimeMillis();
        vector.contains(5);
        stop = System.currentTimeMillis();
        System.out.println("Vector.contains time: " + String.valueOf(stop - start));



    }
}
