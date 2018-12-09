package pl.com.empas.java_introductory_course.collections.common;

public class OrderedPair<V,U> {
    private final V val1;
    private final U val2;

    @Override
    public String toString() {
        return
                "{" + val1.getClass().getSimpleName() + "=" + val1 +
                val2.getClass().getSimpleName() + "=" + val2 +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderedPair<?, ?> that = (OrderedPair<?, ?>) o;

        if (val1 != null ? !val1.equals(that.val1) : that.val1 != null) return false;
        return val2 != null ? val2.equals(that.val2) : that.val2 == null;
    }

    @Override
    public int hashCode() {
        int result = val1 != null ? val1.hashCode() : 0;
        result = 31 * result + (val2 != null ? val2.hashCode() : 0);
        return result;
    }

    public OrderedPair(V val1, U val2) {
        this.val1 = val1;
        this.val2 = val2;
    }

    public V getVal1() {
        return val1;
    }

    public U getVal2() {
        return val2;
    }

}
