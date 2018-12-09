package my_package.enum_example;

public enum Seasons {
    WINTER(-10),
    SUMMER(5),
    SPRING(25),
    AUTUMN(7);

    private float averageTempInC;

    Seasons(float averageTempInC){
    this.averageTempInC =averageTempInC;
    }
    public float getAverageTempInC(){
        return averageTempInC;
    }
}
