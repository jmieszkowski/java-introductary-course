package my_package.garbage_collector;

import java.util.HashSet;
import java.util.Set;

public class FeaturePhoneExample {
    public static void main(String[] args) {

        Set<FeaturePhone> featurePhones = new HashSet<>();
        FeaturePhone nokia1 = new FeaturePhone("Nokia 3310");
        FeaturePhone nokia2 = new FeaturePhone("Nokia 3310");
        System.out.println(nokia1.equals(nokia2));


//        for(;true;){
//            featurePhones.add(new FeaturePhone("Nokia 3310"));
//        }



    }
}
