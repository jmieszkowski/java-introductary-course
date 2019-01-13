package my_package.null_avoid.football;

public class Chair {
    private int Number;


    public Chair(int number) {
        Number = number;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Number=" + Number +
                '}';
    }
}
