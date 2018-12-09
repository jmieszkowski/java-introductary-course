package my_package.date_and_time.new_way;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class NewDateAndTimeExample {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        LocalTime eighteen = LocalTime.of(18,5);


        System.out.println(eighteen);
        System.out.println(localTime);
        System.out.println();

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalDate grunwald = LocalDate.of(1410,07, 15);
        System.out.println(grunwald);

        LocalDateTime localDateTime = LocalDateTime.now();

        LocalDateTime localDateTime2 = LocalDateTime.of(localDate,localTime);

        System.out.println(localDate.format(DateTimeFormatter.ofPattern("YYYY- ")));

        Date maybeNow = new Date();

        Instant instant = Instant.ofEpochMilli(maybeNow.getTime());


        LocalDateTime maybeNow2 = LocalDateTime.ofInstant(instant, ZoneId.systemDefault());
        System.out.println(maybeNow2);



    }
}
