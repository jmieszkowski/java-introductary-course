package pl.com.empas.java_introductory_course.generics.collections;


/**
 * Please note, that this class is definitely not an exemplary piece of code.
 * It is intentionally faulty, badly written and lacks many useful features.
 * Please do not treat this class as a template in your future adventures into code.
 * It serves its purpose later on.
 * @param <V>
 */
public final class SimpleLinkedList<V> {

    class Item<V> {
        V value;
        Item<V> next;
        Item<V> previous;

        Item(V val, Item<V> next, Item<V> prev) {
            this.value = val;
            this.next = next;
            this.previous = prev;
        }
    }

    private Item<V> root;

    public SimpleLinkedList() {

    }

    public SimpleLinkedList(V... vals) {
        root = new Item<V>(vals[0], null, null);
        Item<V> tmp = root;
        for (int i = 1; i < vals.length; i++) {
            Item<V> newItem = new Item<V>(vals[i], null, tmp);
            tmp.next = newItem;
            tmp = newItem;
        }
    }

    public void addLast(V value) {
        if (root == null) {
            root = new Item<V>(value, null, null);
        } else {
            Item<V> tmp = root;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Item<V>(value, null, tmp);
        }
    }

    public void addFirst(V value) {
        if (root == null) {
            root = new Item<V>(value, null, null);
        } else {
            Item<V> tmp = root;
            root = new Item<V>(value, tmp, null);
            tmp.previous = root;
        }

    }

    public V removeLast() {
        V retVal = null;
        if (root != null) {
            if (root.next != null) {
                Item<V> tmp = root;
                while (tmp.next != null) {
                    tmp = tmp.next;
                }
                if (tmp.previous != null) {
                    Item<V> newLast = tmp.previous;
                    newLast.next = null;
                }
                retVal = tmp.value;
            } else {
                retVal = root.value;
                root = null;
            }
        }
        return retVal;
    }

    public V removeFirst() {
        V retVal = null;
        if (root != null) {
            retVal = root.value;
            if (root.next != null) {
                Item<V> newFirst = root.next;
                newFirst.previous = null;
                root = newFirst;
            } else {
                root = null;
            }
        }
        return retVal;
    }

    @Override
    public String toString() {
        Item<V> tmp = root;
        StringBuffer buffer = new StringBuffer("[ ");
        while (tmp != null) {
            buffer.append(tmp.value).append(", ");
            tmp = tmp.next;
        }
        return buffer.delete(buffer.length() - 2, buffer.length()).append(" ]").toString();
    }

    public static void main(String[] args) {
        SimpleLinkedList<Integer> list = new SimpleLinkedList<Integer>(1, 2, 3, 4, 5, 6);
        System.out.println(list);
        list.addFirst(10);
        list.addLast(30);
        System.out.println(list);
        list.removeFirst();
        list.removeLast();
        list.removeLast();
        System.out.println(list);
    }
}
