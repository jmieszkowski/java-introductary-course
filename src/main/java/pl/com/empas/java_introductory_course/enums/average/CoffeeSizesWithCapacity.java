package pl.com.empas.java_introductory_course.enums.average;

public enum CoffeeSizesWithCapacity {
    SMALL(50),
    AVERAGE(70),
    BIG(100),
    HUGE(150);

    private int capacityInMl;

    private CoffeeSizesWithCapacity(int capacityInMl) {
        this.capacityInMl = capacityInMl;
    }

    public int getCapacityInMl() {
        return capacityInMl;
    }
}
