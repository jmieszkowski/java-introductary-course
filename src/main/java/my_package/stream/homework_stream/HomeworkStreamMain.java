package my_package.stream.homework_stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class HomeworkStreamMain {
    public static void main(String[] args) {


        List<Drink> drinkList = new ArrayList<>();
        drinkList.add(new Drink(new Ingredients(true,false,true), "CocaColaCompany"));
        drinkList.add(new Drink(new Ingredients(false,false,true), "CocaColaCompany"));
        drinkList.add(new Drink(new Ingredients(false,true,true), "CocaColaCompany"));
        drinkList.add(new Drink(new Ingredients(true,true,true), "Nestea"));
        drinkList.add(new Drink(new Ingredients(false,false,true), "Tymbark"));



        VendingMachine vendingMachine = new VendingMachine(drinkList,new Snack(new Chips("Lays"),new Nuggets(), new Popcorn()),new Fruit());

        List<Drink> drinksWithoutNuts = getDrinksWithoutNuts(vendingMachine);

        drinksWithoutNuts.forEach(drink -> System.out.println(drink));

    }

    private static List<Drink> getDrinksWithoutNuts(VendingMachine vendingMachine){

        return vendingMachine.getDrink().stream()
                    .filter(drink -> drink.getIngredients().isContainsNuts() == false)
                    .collect(Collectors.toList());
    }
}
