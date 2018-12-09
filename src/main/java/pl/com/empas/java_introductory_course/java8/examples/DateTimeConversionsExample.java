package pl.com.empas.java_introductory_course.java8.examples;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class DateTimeConversionsExample {
    public static void main(String[] args) {
        List<LocalDateTime> dateTimes = Arrays.asList(
                LocalDateTime.now(), LocalDateTime.now().plusHours(2), LocalDateTime.now().minusMinutes(30));


        List<ZonedDateTime> dateTimesZoned =
                dateTimes.stream() // pobieramy strumień z listy data/czasów
                // mapujemy LocalDateTime na ZonedDateTime - klasa ZonedDateTime zawiera informacje o strefie czasowej
                // mapując, podajemy aktualną strefę czasową
                .map(date -> date.atZone(ZoneId.systemDefault()))
                //mapujemy strumień ZonedDateTime na strumień ZonedDateTime, ale w docelowej strefie czasowej
                .map(zonedDate -> zonedDate.withZoneSameInstant(ZoneId.of("America/Los_Angeles")))
                .collect(Collectors.toList());

        System.out.println(dateTimesZoned);

        //TBD
        List<Date> datesOld = dateTimes.stream()
                .map(date -> Date.from(date.toInstant(ZoneId.systemDefault().getRules().getOffset(date))))
                .collect(Collectors.toList());
        System.out.println(datesOld);
    }
}
