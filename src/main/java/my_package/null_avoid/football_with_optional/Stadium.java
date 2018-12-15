package my_package.null_avoid.football_with_optional;

import java.util.Optional;

public class Stadium {
    private Chair chair;

    public Stadium(Chair chair) {
        this.chair = chair;
    }

    public Optional<Chair> getChair() {
        return Optional.ofNullable(chair);
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
