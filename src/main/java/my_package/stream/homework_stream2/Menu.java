package my_package.stream.homework_stream2;

import java.util.LinkedHashMap;
import java.util.Map;

public class Menu {
    Map<Beverage, Boolean> beverages = new LinkedHashMap<>();

    public void addBeverage(Beverage beverage,
                            Boolean specialOfert) {
        beverages.put(beverage, specialOfert);
    }

    public Map<Beverage, Boolean> getBeverages() {
        return beverages;
    }

}
