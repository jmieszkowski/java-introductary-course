package my_package.stream.homework_stream2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // składniki
        Ingredient nuts = new Ingredient("nut");
        Ingredient carrots = new Ingredient("carrot");
        Ingredient cocoNut = new Ingredient("coco nuts");
        Ingredient soya = new Ingredient("soya");
        Ingredient water = new Ingredient("water");
        Ingredient waterMellon = new Ingredient("water mellon");

        // napoje
        Beverage first = new Beverage("first",
                Arrays.asList(water, soya, waterMellon));
        Beverage second = new Beverage("second",
                Arrays.asList(water, cocoNut));
        Beverage third = new Beverage("",
                Arrays.asList(nuts, water, carrots));
        Beverage four = new Beverage("four",
                Arrays.asList(water, waterMellon, nuts));

        // menu

        Menu menu = new Menu();
        menu.addBeverage(first, true);
        menu.addBeverage(second, false);
        menu.addBeverage(third, true);
        menu.addBeverage(four, true);
        // logika

        System.out.println(getNutsFreeBeverages(menu));
        System.out.println(getFilteredBeverages(menu, nuts));
    }

    private static List<Beverage> getNutsFreeBeverages(Menu menu) {
        Ingredient nuts = new Ingredient("nut");
        List<Beverage> result = new ArrayList<>();

        List<Beverage> withoutNuts = menu.getBeverages()
                .keySet()
                .stream()
                .filter(beverage -> !beverage.getIngredientList().contains(nuts))
                .collect(Collectors.toList());

        Map<Beverage, Boolean> beveragesOverSpecialOffert = menu.getBeverages();
        beveragesOverSpecialOffert.forEach((beverage, aBoolean)
                ->  {if (aBoolean && withoutNuts.contains(beverage)) {
            result.add(beverage);
        }
        });

        return result;
    }

    private static List<Beverage> getFilteredBeverages(Menu menu,
                                                       Ingredient unwanted) {
        return menu.getBeverages()
                .entrySet()
                .stream()
                .filter(beverageBooleanEntry -> beverageBooleanEntry.getValue())
                .map(beverageBooleanEntry -> beverageBooleanEntry.getKey())
                .filter(beverage -> !beverage.getIngredientList().contains(unwanted))
                .collect(Collectors.toList());
    }

    private static List<Beverage> getFilteredBeveragesBetterVersion(Menu menu,
                                                                    Ingredient unwanted) {
        return menu.getBeverages()
                .entrySet()
                .stream()
                .filter(Main::isSpecialOffer)
                .map(Main::changeIntoBeverage)
                .filter(beverage -> getOnlyBeveragesWithoutUnwantedIngredient(beverage, unwanted))
                .collect(Collectors.toList());
    }

    private static Beverage changeIntoBeverage(Map.Entry<Beverage, Boolean> entry) {
        return entry.getKey();
    }
    private static boolean isSpecialOffer(Map.Entry<Beverage, Boolean> entry) {
        return entry.getValue() == true;
    }

    private static boolean getOnlyBeveragesWithoutUnwantedIngredient(Beverage beverage, Ingredient unwanted) {
        return !beverage.getIngredientList().contains(unwanted);
    }
}
