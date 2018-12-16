package my_package.stream.homework_stream2;

import java.util.ArrayList;
import java.util.List;

public class Beverage {
        @Override
        public String toString() {
            return "Beverage{" +
                    "ingredientList=" + ingredientList +
                    ", beverageName='" + beverageName + '\'' +
                    '}';
        }

        private List<Ingredient> ingredientList = new ArrayList<>();
        private String beverageName = "";

        public Beverage(String beverageName, List<Ingredient> ingredients) {
            this.beverageName = beverageName;
            ingredientList.addAll(ingredients);
        }

        public List<Ingredient> getIngredientList() {
            return ingredientList;
        }
}
