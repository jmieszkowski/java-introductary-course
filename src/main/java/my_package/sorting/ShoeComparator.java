package my_package.sorting;


import java.util.Comparator;

public class ShoeComparator implements Comparator<Person> {


    @Override
    public int compare(Person o1, Person o2) {
//
//        if (o1.getShoeSize() < o2.getShoeSize()){
//            return -1;
//        } else{
//        return 1;
//         }
                        //    10                  12
                       //    12                  10
         return (int) (o1.getShoeSize() - o2.getShoeSize());
    }
}
