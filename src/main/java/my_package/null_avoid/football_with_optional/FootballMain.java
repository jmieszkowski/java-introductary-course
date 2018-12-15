package my_package.null_avoid.football_with_optional;

import java.util.Optional;

public class FootballMain {
    public static void main(String[] args) {

        FootballClub asd = new FootballClub(new Stadium(new Chair(new Number(1))));

        printChairNumber(asd);



    }

    private static void printChairNumber(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub.getStadium())
                .flatMap(stadium -> stadium.getChair())
                .map(chair -> chair.getNumber())
                .ifPresent(n -> System.out.println(n) );



    }
}
