package pl.com.empas.java_introductory_course.java8.avoid_null_flatmap;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Chipset chipset = new Chipset("amd");
        GraphicsCard graphicsCard = new GraphicsCard(chipset);
        GraphicsCard cardWithoutChipset = new GraphicsCard(null);

        Computer normal = new Computer(graphicsCard);

        Computer withoutGraphicsCard = new Computer(null);
        Computer withCardWithoutChipset = new Computer(cardWithoutChipset);

        safePrint(normal);
    }

    private static void safePrint(Computer computer) {
        Optional.ofNullable(computer)
                .flatMap(Computer::getCard)
                .map(GraphicsCard::getChipset)
                .flatMap(Chipset::getVendorName)
                .ifPresent(System.out::println);
    }
}
