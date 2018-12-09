package pl.com.empas.java_introductory_course.generics.converters;

public class BooleanToStringConverter implements ConverterContract<Boolean, String> {
    public String convert(Boolean value) {
        return value == null ? "null" : value.toString();
    }

    public static void main(String [] args) {
        ConverterContract<Boolean, String> converter = new BooleanToStringConverter();
        System.out.println(converter.convert(null));
        System.out.println(converter.convert(Boolean.valueOf(true)));
        System.out.println(converter.convert(false));
    }
}
