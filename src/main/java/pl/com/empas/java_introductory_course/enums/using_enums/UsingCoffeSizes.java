package pl.com.empas.java_introductory_course.enums.using_enums;

import pl.com.empas.java_introductory_course.enums.simple.CoffeeSizes;

public class UsingCoffeSizes {

    public static void main(String[] args) {
//        CoffeeSizes myCoffee = new CoffeeSizes();

        CoffeeSizes coffee = CoffeeSizes.BIG;
//        CoffeeSizes yourCoffee = ""

        System.out.println(coffee);

        System.out.println("Printing all coffee sizes");
        for (CoffeeSizes coffeeItem : CoffeeSizes.values()) {
            System.out.println(coffeeItem);
        }
    }
}
