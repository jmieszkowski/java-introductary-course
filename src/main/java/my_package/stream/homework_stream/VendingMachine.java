package my_package.stream.homework_stream;

import java.util.List;

public class VendingMachine {
    private List<Drink> drink;
    private Snack snack;
    private Fruit fruit;

    public VendingMachine(List<Drink> drink, Snack snack, Fruit fruit) {
        this.drink = drink;
        this.snack = snack;
        this.fruit = fruit;
    }

    public List<Drink> getDrink() {
        return drink;
    }

    public void setDrink(List<Drink> drink) {
        this.drink = drink;
    }

    public Snack getSnack() {
        return snack;
    }

    public void setSnack(Snack snack) {
        this.snack = snack;
    }

    public Fruit getFruit() {
        return fruit;
    }

    public void setFruit(Fruit fruit) {
        this.fruit = fruit;
    }
}

