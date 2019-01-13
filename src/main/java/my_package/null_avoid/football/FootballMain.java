package my_package.null_avoid.football;

import java.util.Optional;

public class FootballMain {
    public static void main(String[] args) {

    }

    private static void printChairNumber(FootballClub footballClub){
        Optional.ofNullable(footballClub)
                .map(footballClub1 -> footballClub1.getStadion())
                .map(stadium -> stadium.getChair())
                .map(chair -> chair.getNumber())
                .ifPresent(n -> System.out.println("Number: "+ n));



    }
}
