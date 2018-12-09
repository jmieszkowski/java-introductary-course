package my_package.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MainStream {
    public static void main(String[] args) {
        List<Country> countries = Arrays.asList(
                new Country("Poland", 38_000_000, 312, 5_000),
                new Country("Russia", 1_38_000_000, 2312, 86_000),
                new Country("China", 2_38_000_000, 3112, 12_000),
                new Country("Ukraine", 8_000_000, 112, 56_000),
                new Country("Holland", 2_000_000, 412, 24_000),
                new Country("Spain", 3_000_000, 312, 25_000)
        );


        List<Country> richCountries = getListOfRichCountries(countries);

        List<Country> bigCountries = genericFilter(countries, country -> country.getArea() > 412);
        List<Country> populatedCountries = genericFilter(countries, country -> country.getNumberOfPeople() > 1_000_000);



        for (Country c : bigCountries){
            System.out.println(c);
        }

        populatedCountries.forEach(country-> System.out.println(country));


    }

    private static List<Country> getListOfRichCountries(List<Country> countries) {

        List<Country> richCounries = new ArrayList<>();

        for (Country c : countries) {

            if (c.getAveragePayCheck() > 24_500) {
                richCounries.add(c);
            }

        }

        return richCounries;
    }
    private static List<Country> getListOfPopulatedCountries(List<Country> countries, long numberOfPeople){

        List<Country> populatedCounries = new ArrayList<>();

        for(Country c : countries){

                if (c.getNumberOfPeople() > numberOfPeople){
                    populatedCounries.add(c);
                }

        }

        return populatedCounries;
    }

    private static List<Country> filterByMinimalPeopleNumber(List<Country> countries, long minimalNumberOfPeople){

        return countries.stream()
                .filter(country -> country.getNumberOfPeople() > minimalNumberOfPeople)
                .collect(Collectors.toList());

    }


    private static List<Country> genericFilter(List<Country> countries, Predicate<Country> predicate){

        return countries.stream()
                .filter(predicate)
                .collect(Collectors.toList());

    }

}
