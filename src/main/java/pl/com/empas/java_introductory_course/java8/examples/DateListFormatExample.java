package pl.com.empas.java_introductory_course.java8.examples;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DateListFormatExample {

    public static void main(String[] args) {
        //FORMAT: YYYY-MM-dd
        //Przekształć listę dat do listy stringów wedle formatu podanego powyżej

        //Tworzymy formatter, któ®ego będziemy używać do formatowania daty
        final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");

        //Lista dat, które będziemy formatować
        List<LocalDate> dates = Arrays.asList(
                LocalDate.now(), LocalDate.now().plusDays(2), LocalDate.now().minusMonths(1));

        List<String> dateStrings = dates
                .stream() // Pobieramy strumień dat z kolekcji
                .map(date -> date.format(formatter)) //mapujemy każdą datę na Stringa używając formatera
                .collect(Collectors.toList()); //zbieramy do kupy :)
        System.out.println(dateStrings);

    }
}
