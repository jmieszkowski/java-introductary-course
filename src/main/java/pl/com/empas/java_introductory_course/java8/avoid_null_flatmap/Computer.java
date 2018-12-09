package pl.com.empas.java_introductory_course.java8.avoid_null_flatmap;

import java.util.Optional;

public class Computer {
    private GraphicsCard card;

    @Override
    public String toString() {
        return "Computer{" +
                "card=" + card +
                '}';
    }

    public Optional<GraphicsCard> getCard() {
        return Optional.ofNullable(card);
    }

    public void setCard(GraphicsCard card) {
        this.card = card;
    }

    public Computer(GraphicsCard card) {

        this.card = card;
    }
}
