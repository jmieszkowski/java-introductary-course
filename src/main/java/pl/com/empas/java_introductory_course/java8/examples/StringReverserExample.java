package pl.com.empas.java_introductory_course.java8.examples;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringReverserExample {

    public static void main(String[] args) {

        Stream<String> stream = Stream.of("This", "is", "a", "String", "Stream", "Example");
        System.out.println(stream.map(function).collect(Collectors.toList()));

    }

    static Function<String, String> function = new Function<String, String>() {
        @Override
        public String apply(String o) {
            String ret = "";
            for (int i = o.length() - 1; i >= 0; i--) {
                ret += o.charAt(i);
            }
            return ret;
        }
    };

}
