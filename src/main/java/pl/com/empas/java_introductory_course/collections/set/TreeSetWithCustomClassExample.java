package pl.com.empas.java_introductory_course.collections.set;

import pl.com.empas.java_introductory_course.collections.set.model.Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetWithCustomClassExample {

    public static void main(String[] args) {
        List<Tree> listOfTrees = new ArrayList<>();

        listOfTrees.add(new Tree("Jodła", 15));
        listOfTrees.add(new Tree("Topola", 30));
        listOfTrees.add(new Tree("Dąb", 10));
        listOfTrees.add(new Tree("Dąb", 10));
        listOfTrees.add(new Tree("Buk", 10));

        new Tree("Jodła", 15).compareTo(new Tree("Buk", 10));

        Set<Tree> setOfTrees = new TreeSet<>();
        setOfTrees.addAll(listOfTrees);

        System.out.println(setOfTrees);
    }
}
