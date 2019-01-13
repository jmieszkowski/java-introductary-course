package my_package.sorting.sorting_exercise2;

import java.time.LocalDate;
import java.util.*;
import java.util.List;


public class sortingExercise2Main {
    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>(Arrays.asList(
            new Car("red", "porshe", "bsd109", LocalDate.of(2017,7,10), 200),
            new Car("blue", "lexus", "asd78", LocalDate.of(2001,6,6), 300),
            new Car("yellow", "alfa", "csd78", LocalDate.of(2008,8,5), 400),
            new Car("green", "ferari", "hsd67", LocalDate.of(2017,5,12), 600),
            new Car("light blue", "lamborgini", "gsd456", LocalDate.of(2017,6,12), 600),
            new Car("orange", "nissan", "ksd123", LocalDate.of(2018,5,10), 700),
            new Car("red", "porshe", "ksd123", LocalDate.of(2019,1,10), 800)


        ));


//        Collections.sort(carList);
//        Collections.sort(carList, new PowerComparator());

        Comparator<Car> comparator = Comparator.comparing(Car::getModel).reversed().thenComparing(Car::getColour);





        Comparable<Car> comparable = car -> car.getPower();

//        carList.get(1).maybeCompare(car -> {car.getPower()};


        carList.sort((o1, o2) -> o1.getColour().compareTo(o2.getColour()));


        carList.sort(comparator);
        System.out.println(carList);

        CarPlayer carPlayer = new CarPlayer();
        carPlayer.playWithCarAction(car -> { System.out.println("move.."); },
                new Car("red", "porshe", "ksd123", LocalDate.of(2019,1,10), 800)
        );

        carPlayer.playWithCarAction(sortingExercise2Main::move,
                new Car("red", "porshe", "ksd123", LocalDate.of(2019,1,10), 800)
        );

    }

    private static void move(Car car) {
        System.out.println("MOVE");
    }


}
