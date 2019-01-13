package my_package.solid.liskov_substitution;

public class Main {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("Samsung");
        FeaturePhone featurePhone = new FeaturePhone("Samsung");

        System.out.println(featurePhone.equals(smartPhone));

        System.out.println(smartPhone.equals(featurePhone));


    }
}
