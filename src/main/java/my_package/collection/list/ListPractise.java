package my_package.collection.list;

import java.util.ArrayList;
import java.util.List;

public class ListPractise {
    public static void main(String[] args) {
        List<Integer> intList = new ArrayList<>();

        intList.add(1);
        intList.add(10);

        int result = intList.get(0) + intList.get(1);

        System.out.println(result);

        for(Integer integers : intList){
            System.out.println(integers);
        }
    }
}
