package equals_and_hashcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyCollectionTest {

    public static void main(String[] args) {
        List<Integer> intList1 = new ArrayList<>();
        List<Integer> intList2 = new LinkedList<>();

        for(int i =0; i < 500; i++){
            intList1.add(i);
            intList2.add(i);
        }
        double timeStart = System.currentTimeMillis();
        for (int i = intList1.size() -1; i >= 0; i--){
            System.out.println(i + ": " + intList1.get(i));
            System.out.println(i + ": " +intList2.get(i));
        }

        double timeElapsed = System.currentTimeMillis() - timeStart;
        System.out.println(timeElapsed);
//        System.out.println(intList1.get(50));
//        intList1.set(50,20);
//        System.out.println(intList1.get(50));
//        System.out.println(intList2.get(30));
//        intList2.set(30,10);
//        System.out.println(intList2.get(30));

    }
}
