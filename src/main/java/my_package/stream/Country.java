package my_package.stream;

public class Country {

    private String name;
    private long numberOfPeople;
    private double area;
    private double averagePayCheck;

    public Country(String name, long numberOfPeople, double area, double averagePayCheck) {
        this.name = name;
        this.numberOfPeople = numberOfPeople;
        this.area = area;
        this.averagePayCheck = averagePayCheck;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getNumberOfPeople() {
        return numberOfPeople;
    }

    public void setNumberOfPeople(long numberOfPeople) {
        this.numberOfPeople = numberOfPeople;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getAveragePayCheck() {
        return averagePayCheck;
    }

    public void setAveragePayCheck(double averagePayCheck) {
        this.averagePayCheck = averagePayCheck;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", numberOfPeople=" + numberOfPeople +
                ", area=" + area +
                ", averagePayCheck=" + averagePayCheck +
                '}';
    }
}
