package pl.com.empas.java_introductory_course.io.examples;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class SquareRootsExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,3,4,5,6);
        list.stream()
                //dla każdej liczby, zmapuj ją na jej pierwiastek
                .map(Math::sqrt)
                //Z wartości pierwiatka stwórz z niej Stringa
                .map(String::valueOf)
                // i każdy z wyników zapisz do pliku
                .forEach(x -> write(Paths.get("Sqrt.txt"), x));
    }

    public static void write(Path p, String s) {
        try {
            Files.write(p, (s + "\n").getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
