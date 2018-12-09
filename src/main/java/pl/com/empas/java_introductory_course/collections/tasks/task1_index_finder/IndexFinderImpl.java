package pl.com.empas.java_introductory_course.collections.tasks.task1_index_finder;

import pl.com.empas.java_introductory_course.collections.common.FruitGenerator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IndexFinderImpl<E> implements IndexFinder<E> {


    /*
    Create implementation of the IndexFinder interface.

     */
    @Override
    public Integer findFirstIndexOf(E elem, List<E> list) {
        return list.indexOf(elem);
    }

    @Override
    public List<Integer> findAllIndexesOf(E element, List<E> list) {
        List<Integer> indexes = new ArrayList<>();
        for(int i = 0; i<list.size(); i++) {
            E candidate = list.get(i);
            if(candidate.equals(element)) {
                indexes.add(i);
            }
        }
        if(indexes.size() == 0)
            indexes.add(-1);
        return indexes;
    }


    public static void main(String args []) {
        IndexFinderImpl<String> indexFinder = new IndexFinderImpl<>();
        List<String> fruitList = FruitGenerator.getFruitList();

        int orangeIndex = indexFinder.findFirstIndexOf("Orange", fruitList);
        int carrotIndex = indexFinder.findFirstIndexOf("Carrot", fruitList);

        System.out.println("List index of 'Orange' is: " + orangeIndex);
        System.out.println("List index of 'Carrot' is: " + carrotIndex);

        //---------------------------
        List<Integer> orangeIndexes = indexFinder.findAllIndexesOf("Orange", fruitList);
        List<Integer> carrotIndexes = indexFinder.findAllIndexesOf("Carrot", fruitList);
        System.out.println("All indexes of 'Orange' are: " + orangeIndexes);
        System.out.println("All indexes of 'Carrot' are: " + carrotIndexes);
    }
}
