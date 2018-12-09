package my_package.null_avoid.optional;

import java.util.Optional;

public class NullAvoidMain {
    public static void main(String[] args) {
        House houseEmpty = new House(null);
        House houseWithBatrhoowm = new House(new Bathroom(null));
        House houseWithEverything = new House(new Bathroom(new Sink("Bosh")));

        Sink sink = new Sink("KOLO");
        Bathroom withoutSink = new Bathroom(null);
        Bathroom withSink = new Bathroom(sink);

        Optional<String> maybeString = Optional.empty();
        Optional<String> stringForSure = Optional.of("Jędrek");

        System.out.println(stringForSure.get());
        String maybeNull = null;

        Optional<String> absentString = Optional.ofNullable(maybeNull);

        absentString.ifPresent(x -> System.out.println(x));


        printLabelSlowMode(houseEmpty);
        printLabelSlowMode(houseWithBatrhoowm);
        printLabelSlowMode(houseWithEverything);






    }


    private static void printLabelSlowMode(House house){
        Optional<House> maybeHouse = Optional.ofNullable(house);
        String label ="empty";
        if(maybeHouse.isPresent()){
            Optional<Bathroom> maybeBathroom = maybeHouse.get().getBathroom();
            if(maybeBathroom.isPresent()){
                Optional<Sink> maybeSink = maybeBathroom.get().getSink();

                if (maybeSink.isPresent()){
                    label = maybeSink.get().getLabel();
                }
            }
        }

        System.out.println(label);
    }


    private static void printLabelWithLambda(House house){

        Optional.ofNullable(house).ifPresent(house1 -> house1.getBathroom().
                ifPresent(bathroom -> bathroom.getSink()
                        .ifPresent(sink -> System.out.println(sink.getLabel()))));


    }

    private static void printLabelWithLambdaBetter(House house){
        Optional.ofNullable(house)
                .flatMap(house1 -> house1.getBathroom())
                .flatMap(bathroom -> bathroom.getSink())
                .map(sink -> sink.getLabel())
                .ifPresent(s -> System.out.println("Label: " + s));
    }


}
