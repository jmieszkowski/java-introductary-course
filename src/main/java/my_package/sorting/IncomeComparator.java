package my_package.sorting;

import java.util.Comparator;

public class IncomeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
                        // 20               30
        return (int) (o2.getIncome() - o1.getIncome());
    }
}
