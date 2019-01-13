package my_package.stream.homework_stream;

public class Drink {
    private Ingredients ingredients;
    private String label;

    public Drink(Ingredients ingredients, String label) {
        this.ingredients = ingredients;
        this.label = label;
    }

    public Ingredients getIngredients() {
        return ingredients;
    }

    public void setIngredients(Ingredients ingredients) {
        this.ingredients = ingredients;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "ingredients=" + ingredients +
                ", label='" + label + '\'' +
                '}';
    }
}
