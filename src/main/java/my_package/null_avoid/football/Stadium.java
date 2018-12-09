package my_package.null_avoid.football;

public class Stadium {
    private Chair chair;

    public Stadium(Chair chair) {
        this.chair = chair;
    }

    public Chair getChair() {
        return chair;
    }

    public void setChair(Chair chair) {
        this.chair = chair;
    }

    @Override
    public String toString() {
        return "Stadium{" +
                "chair=" + chair +
                '}';
    }
}
