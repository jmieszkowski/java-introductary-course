package pl.com.empas.java_introductory_course.time.java8;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class LocalTimeExample {

    public static void main(String[] args) {
        ZoneId id = ZoneId.of("Europe/London");
        LocalDateTime now = LocalDateTime.now();
        ZonedDateTime zoned = ZonedDateTime.of(now, id);

    }
}
