package my_package.sorting.sorting_exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingExerciseMain {
    public static void main(String[] args) {
        List<Clothes> clothes = new ArrayList<>(Arrays.asList(
           new Clothes(20,"T-Shirt"),
           new Clothes(15,"Hoodie"),
           new Clothes(37,"Jacket"),
           new Clothes(37,"Trousers"),
           new Clothes(36,"Dress")
        ));

        Comparator<Clothes> myComparator = Comparator.comparing(Clothes::getSize).reversed().thenComparing((o1, o2) ->o1.getName().compareTo(o2.getName()) );
        clothes.sort(myComparator);
        System.out.println(clothes);

    }

}
