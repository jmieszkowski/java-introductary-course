package collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapFirstExample {
    public static void main(String[] args) {
        Map<String, String> idsOverNames = new HashMap<>();
        System.out.println(idsOverNames.put("82", "Jędrek"));
        System.out.println(idsOverNames.put("83", "Marcin"));
        System.out.println(idsOverNames.put("84", "Mariusz"));
        System.out.println(idsOverNames.put("85", "Marcel"));
        System.out.println(idsOverNames.put("86", "Marta"));
        System.out.println(idsOverNames.put("87", "Marian"));


        for(String key : idsOverNames.keySet()){
            System.out.println("Key: " + key + ", value: " + idsOverNames.get(key));
        }

        Map<String, String> secondMap = new LinkedHashMap<>();


    }
}
