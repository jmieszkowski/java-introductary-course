package my_package.null_avoid.football_with_optional;

public class Chair {
    private Number number;

    public Chair(Number number) {
        this.number = validateNumber(number);
    }

    public Number getNumber() {
        return number;
    }

    public void setNumber(Number number) {
        this.number = validateNumber(number);
    }



    private Number validateNumber(Number number){

        if(null == number){
            throw new IllegalArgumentException("Number cannot be int!");
        }

        return number;
    }

    @Override
    public String toString() {
        return "Chair{" +
                "Number=" + number +
                '}';
    }
}
