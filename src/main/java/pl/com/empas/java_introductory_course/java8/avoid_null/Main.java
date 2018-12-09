package pl.com.empas.java_introductory_course.java8.avoid_null;

import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        Chipset empty = new Chipset(null);
        Chipset nVidia = new Chipset("nVidia");

        GraphicsCard emptyVendro = new GraphicsCard(null);
        GraphicsCard withNvidia = new GraphicsCard(nVidia);

        Computer normal = new Computer(withNvidia);
        Computer withoutGraphicsCard = new Computer(null);
        Computer withCardWithoutChipset = new Computer(new GraphicsCard(null));

        printVendorNameVeryNaive(normal);
        printVendorNameVeryNaive(null);
//        printVendorNameVeryNaive(withoutGraphicsCard);
    }

    public static void printVendorNameVeryNaive(Computer computer) {
        System.out.println(computer.getGraphicsCard().getChipset().getVendror());
    }

    public static void safePrintWithNull(Computer computer) {

        if (null != computer) {
            GraphicsCard card = computer.getGraphicsCard();
            if (null != card) {
                Chipset chipset = computer.getGraphicsCard().getChipset();
                if (null != chipset) {
                    if (null != chipset.getVendror()) {
                        System.out.println(chipset.getVendror());
                    }
                }
            }
        }
    }

    public static void printWithOptional(Computer computer) {
        Optional<Computer> maybeComputer = Optional.ofNullable(computer);
        maybeComputer.map(Computer::getGraphicsCard)
                .map(GraphicsCard::getChipset)
                .map(Chipset::getVendror)
                .ifPresent(System.out::println);
    }
}
