package my_package.null_avoid.football_with_optional;

public class Number {
    int number;

    public Number(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "number = " + number;
    }
}
