package pl.com.empas.java_introductory_course.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TwoDList {

    public static void main(String [] args) {
        List<List<Integer>> twoDList = new ArrayList<>();
        for(int i = 0; i < 10; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                list.add(j);
            }
            twoDList.add(list);
        }
        System.out.println(twoDList);

        for(List<Integer> list : twoDList) {
            Iterator<Integer> iterator = list.iterator();
            int sum = 0;
            while(iterator.hasNext()) {
                sum += iterator.next();
            }
            System.out.println("Sum of column " + twoDList.indexOf(list) + " " + sum);
        }



    }
}
