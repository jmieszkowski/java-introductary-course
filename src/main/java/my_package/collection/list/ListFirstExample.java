package my_package.collection.list;

import my_package.package_test.plant.Cactus;
import my_package.package_test.plant.Plant;
import my_package.package_test.plant.Rose;
import my_package.package_test.plant.pricklyPear;

import java.util.ArrayList;
import java.util.List;

public class ListFirstExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("enum");
        strings.add("abstract");

        List<Plant> plants = new ArrayList<>();
        Plant rose = new Rose(10,10,10);
        Plant cactus = new Cactus(10,10,10);
        Plant prickly = new pricklyPear(10,10,10);

        plants.add(prickly);
        plants.add(rose);
        plants.add(cactus);

        plants.set(1, new Rose(10,10,10));

        for(Plant p : plants){
            System.out.println(p);
        }

        for (String s : strings){
            System.out.println(s);
        }

    }
}
