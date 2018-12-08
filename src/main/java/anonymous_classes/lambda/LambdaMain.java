package anonymous_classes.lambda;

public class LambdaMain {
    public static void main(String[] args) {
        Flyable bird = new Bird();

        Flyable plane = new Flyable() {
            @Override
            public void fly() {
                System.out.println("PLane can fly");
            }
        };


        Flyable bullet = () -> System.out.println("Bullet can fly");

        Moveable cat = new Moveable() {
            @Override
            public void move() {
                System.out.println("Cat can move");
            }
        };

        Moveable dog = () -> System.out.println("Dog can move");

        Swimable fish = (distance, speed) -> System.out.println("My distance is " + distance+ ". I swim with "+speed+" km/h");

        fish.swim(10,10);
    }
}
