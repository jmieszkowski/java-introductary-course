package pl.com.empas.java_introductory_course.io.examples;

import pl.com.empas.java_introductory_course.io.nio.ReadFileExample;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SeekableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CountWordsExample {
    public static void main(String[] args) throws IOException {
        Optional<String> maybeString = ReadFileExample.readStringSimple("Text.txt");

        //Tworzymy kanał zapisu do pliku
        Path outputPath = Paths.get("CountOutput.txt");
        SeekableByteChannel channel = Files.newByteChannel(outputPath,
                StandardOpenOption.CREATE, StandardOpenOption.APPEND);
        String entryString = neatLambdaParsing(maybeString);
        //String entryString = simpleOptionalParsing(maybeString);
        //Zapisujemy
        ByteBuffer buffer = ByteBuffer.wrap(entryString.getBytes());
        channel.write(buffer);
    }

    public static String simpleOptionalParsing(Optional<String> maybeString) {
        if(maybeString.isPresent()) {
            String text = maybeString.get().toLowerCase().replaceAll("[^a-z ]", "");
            String [] splitText = text.split("\\s+");
            List<String> list = Arrays.asList(splitText);

            Map<String, Integer> map = list.stream()
                    //eliminujemy elementy powtarzające się
                    .distinct()
                    //i zbieramy do mapy jako klucz podając stringa
                    //a jako wartość ilość powtórzeń stringa w liście list
                    .collect(Collectors.toMap(x -> x, x -> Collections.frequency(list, x)));

            StringBuilder builder = new StringBuilder();
            map.entrySet().stream().forEach(entry ->
                    builder.append(entry.getKey())
                            .append(" : ")
                            .append(entry.getValue())
                            .append("\n"));
            return builder.toString();
        }
        else return "";
    }

    public static String neatLambdaParsing(Optional<String> maybeString) {
        //Tworzymy listę stringów:
        List<String> list = maybeString
                //mapując wartość Optionala na Optional<String> ale pisany z małych liter
                //i bez znaków przestankowych
                .map(x -> x.toLowerCase().replaceAll("[^a-z ]", ""))
                //mapujemy tego stringa na tablicę stringów dzieląc go po "znakach białych" - tabulator, spacja
                .map(x -> x.split("\\s+"))
                //mapujemy używając referencji metody ze String []  na Stream<String>
                .map(Arrays::stream)
                //MEtoda optionala .orElse zwraca wartość optionala, jeżeli istnije
                //a jeżeli nie - zwracana jest wartość z parametru przekazanego do orElse
                .orElse(Stream.empty())
                //I na koniec zbieramy do listy
                .collect(Collectors.toList());

        Map<String, Integer> map = list.stream()
                //eliminujemy elementy powtarzające się
                .distinct()
                //i zbieramy do mapy jako klucz podając stringa
                //a jako wartość ilość powtórzeń stringa w liście list
                .collect(Collectors.toMap(x -> x, x -> Collections.frequency(list, x)));

        //Tworzymy stringa do zapisu do pliku pobierając strumień ze zbioru par klucz-wartość mapy
        return map.entrySet().stream()
                //opcjonalnie - sortujemy strumień podając komparator sprawdzający które częstości wystąpień są większe
                .sorted(comparator)
                //tworzymy stringa dla każdej pary klucz-wartość w postaci "klucz : wartość"
                .map(x -> x.getKey() + " : " + x.getValue())
                //Poprzez zastosowanie collectora .joining - tworzymy jednego stringa z wszstkich
                //stringów cząstkowych łącząc je znakiem końca linii
                .collect(Collectors.joining("\n"));

    }

    //Komparator porównujący pary klucz-wartość
    static Comparator<Map.Entry<String, Integer>> comparator = new Comparator<Map.Entry<String, Integer>>() {
        @Override
        public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
            return o1.getValue() == o2.getValue() ? 0
                    : o1.getValue() > o2.getValue() ? -1 : 1;
        }

    };
}
