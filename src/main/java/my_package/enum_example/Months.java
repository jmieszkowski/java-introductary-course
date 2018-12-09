package my_package.enum_example;

public enum Months {
    JANNUARY(31),
    FEBRUARY(28),
    MARCH(31),
    APRIL(30),
    MAY(31),
    JUNE(30),
    JULY(31),
    AUGUST(30),
    SEPTEMBER(31),
    OCTOBER(30),
    NOVEMBER(31),
    DECEMBER(30);

    private int numberOfDays;

    Months(int numberOfDays){
        this.numberOfDays = numberOfDays;

    }
    public int getNumberOfDays(){
        return numberOfDays;
    }
}
