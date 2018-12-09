package pl.com.empas.java_introductory_course.generics.converters;

import java.util.Optional;

public class StringToIntegerConverter implements ConverterContract<String, Optional<Integer>> {
    @Override
    public Optional<Integer> convert(String value) {
        try {
            return  Optional.of(Integer.parseInt(value));
        } catch(NumberFormatException ex) {
            //ex.printStackTrace();
            return Optional.empty();
        }
    }

    public static void main (String args []) {
        ConverterContract<String, Optional<Integer>> converter = new StringToIntegerConverter();
        System.out.println(converter.convert("-1234577777").get());
        System.out.println(converter.convert("98764").get());
        System.out.println(converter.convert("0012345").get());
        System.out.println(converter.convert("0x00ff").get());
        System.out.println(converter.convert("test").get());
        System.out.println(converter.convert(null).get());
        Optional<String> [] array;
    }

}
