package pl.com.empas.java_introductory_course.collections.lists;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class ArrayListSort {

    public static void main(String [] args) {
        List<String> list = Arrays.asList("z", "d", "a", "aa", "Pan Piotr");
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1 == null) return -1;
                if(o2 == null) return 1;
                if(o1.equals(o2)) return 0;

                int o1Len = o1.length();
                int o2Len = o2.length();
                int len = o1Len > o2Len ? o2Len : o1Len;
                String str1 = o1.toUpperCase();
                String str2 = o2.toUpperCase();
                for(int i = 0; i< len; i++) {
                    if(str1.charAt(i) != str2.charAt(i))
                        return str1.charAt(i) > str2.charAt(i) ? 1 : -1;
                }
                return o1Len > o2Len ? 1 : -1;

            }
        });

        System.out.println(list);

        List<Number> list2 = Arrays.asList(3.0, 1, 2, -12456, -0.00001);
        list2.sort(new Comparator<Number>() {
            @Override
            public int compare(Number o1, Number o2) {
                if(o1 == null) return -1;
                if(o2 == null) return 1;
                if(o1.equals(o2)) return 0;
                return new BigDecimal(o1.toString()).compareTo(new BigDecimal(o2.toString()));
            }
        });

        System.out.println(list2);
    }

}
