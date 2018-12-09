package pl.com.empas.java_introductory_course.java8.avoid_null;

public class Computer {
    private GraphicsCard graphicsCard;

    public Computer(GraphicsCard graphicsCard) {

        this.graphicsCard = graphicsCard;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public void setGraphicsCard(GraphicsCard graphicsCard) {
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "graphicsCard=" + graphicsCard +
                '}';
    }
}
