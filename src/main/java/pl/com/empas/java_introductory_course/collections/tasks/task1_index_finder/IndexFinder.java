package pl.com.empas.java_introductory_course.collections.tasks.task1_index_finder;

import java.util.Collection;
import java.util.List;

public interface IndexFinder<E> {


    /**
     * Implementation should find index of given element E elem in a list of elements
     * @param elem - element to find index of
     * @param list - list of elements;
     * @return found index. -1 if not found
     */
    Integer findFirstIndexOf(E elem, List<E> list);

    /**
     *
     * @param element an element to find all indexes of
     * @param list - a list containing elements to be found
     * @return - a list of indexes corresponding to List<E> elements in List<E> list. Order matters!
     */
    List<Integer> findAllIndexesOf(E element, List<E> list);


}
