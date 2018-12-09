package my_package.null_avoid;

import java.util.Optional;

public class NullAvoidMain {
    public static void main(String[] args) {
        House houseEmpty = new House(null);
        House houseWithBatrhoowm = new House(new Bathroom(null));
        House houseWithEverything = new House(new Bathroom(new Sink("Bosh")));

        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);


        displaySinkName(houseWithBatrhoowm);
        displaySinkName(houseWithEverything);

        printLabelWithLambda(houseWithBatrhoowm);
        printLabelWithLambda(houseWithEverything);

    }

    private static void displaySinkName(House house) {
        if (null != house && null != house.getBathroom() && null != house.getBathroom().getSink() && null != house.getBathroom().getSink().getLabel()) {

            System.out.println(house.getBathroom().getSink().getLabel());

        } else {

            System.out.println("Found null :((((( ");

        }
    }

    private static void printLabelWithLambda(House house){
        Optional.ofNullable(house)
                .map(house1 -> house1.getBathroom())
                .map(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("Label: " + s));

    }
}
