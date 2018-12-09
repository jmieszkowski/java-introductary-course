package pl.com.empas.java_introductory_course.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExample {

    public static void main(String [] args) {
        Map<Character, Integer> repetitions = createRepetitionsMap("Bardziej rozbudowany tekst testowy zawierający więcej liter".toUpperCase());
        System.out.println(repetitions);
        Map.Entry<Character, Integer> bestEntry = getBestEntryFromMap(repetitions);
        System.out.println("Max repetitions value is: " + bestEntry.getValue() + " for char: " + bestEntry.getKey());
        System.out.println("Number of repetitions of char Ą: " + repetitions.get('Ą'));
    }

    public static Map<Character, Integer> createRepetitionsMap(String str) {
        Map<Character,Integer> repetitions = new HashMap<>();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(Character.isAlphabetic(c)) {
                if (!repetitions.containsKey(c)) {
                    repetitions.put(c, 1);
                } else {
                    Integer number = repetitions.get(c);
                    repetitions.put(c, number + 1);
                }
            }
        }
        return repetitions;
    }

    public static Map.Entry<Character, Integer>  getBestEntryFromMap(Map<Character, Integer> map) {
        Map.Entry<Character, Integer> bestEntry = null;
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();

        while(iterator.hasNext()) {
            Map.Entry<Character, Integer> candidate = iterator.next();
            if(bestEntry == null || bestEntry.getValue() <= candidate.getValue()) {
                bestEntry = candidate;
            }
        }
        return bestEntry;
    }


}
