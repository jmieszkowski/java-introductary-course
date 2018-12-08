package anonymous_classes.lambda;

@FunctionalInterface
public interface FormulaConverter {

    double fromCelsiusToFahrenheit(double celsius);
    default double fromFahrenheitToCelsius(double fahr){
        return 0;
    }
}
