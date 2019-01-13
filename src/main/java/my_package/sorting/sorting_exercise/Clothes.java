package my_package.sorting.sorting_exercise;

public class Clothes {
    private int size;
    private String name;

    public Clothes(int size, String name) {
        this.size = size;
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Clothes{" +
                "size=" + size +
                ", name='" + name + '\'' +
                '}';
    }
}
