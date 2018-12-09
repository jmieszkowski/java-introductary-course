package pl.com.empas.java_introductory_course.collections.common;

import java.util.*;
import java.util.stream.Collectors;

public class FruitGenerator {

    static List<String> fruit = Arrays.asList("Apple", "Banana", "Grapefruit", "Lemon", "Orange", "Pear", "Kiwi", "Orange", "Apple");
    static Random random = new Random(System.currentTimeMillis());
    static FruitMapGenerator fruitMapGenerator = new FruitMapGenerator();

    public static List<String> getFruitList() {
        return fruit;
    }

    public static String [] getFruitArray() {
        return fruit.toArray(new String [0]);
    }

    public static Set<String> getFruitSet() {
        return new HashSet<>(fruit);
    }

    public static Map<String, Integer> getFruitPriceMap() {
        return fruitMapGenerator.generate(fruit);
    }

    static class FruitMapGenerator {
        public Map<String, Integer> generate(Collection<String> fruitCollection) {
            return fruitCollection.stream().collect(Collectors.toMap(s -> s, s -> random.nextInt(11)));
        }
    }

}
