package anonymous_classes.lambda;

public class ConverterMain {
    public static void main(String[] args) {
        FormulaConverter converter = celsius -> (celsius* 9.0/5.0) + 32;

        System.out.println(converter.fromCelsiusToFahrenheit(20));



    }
}
