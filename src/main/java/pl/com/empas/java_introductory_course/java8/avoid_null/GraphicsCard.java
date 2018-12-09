package pl.com.empas.java_introductory_course.java8.avoid_null;

public class GraphicsCard {
    private Chipset chipset;

    public GraphicsCard(Chipset chipset) {

        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "GraphicsCard{" +
                "chipset=" + chipset +
                '}';
    }

    public Chipset getChipset() {
        return chipset;
    }

    public void setChipset(Chipset chipset) {
        this.chipset = chipset;
    }
}
