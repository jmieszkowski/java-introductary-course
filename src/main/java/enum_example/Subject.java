package enum_example;

public enum Subject {
    RM(60),
    CKM(50),
    ST(50),
    SD(60);



    int numberOfHours;
    Subject(int numberOfHours){
        this.numberOfHours = numberOfHours;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }
}

